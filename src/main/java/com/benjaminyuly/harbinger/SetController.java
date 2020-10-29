package com.benjaminyuly.harbinger;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SetController {
	private final SetRepository repository;
	
	SetController(SetRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/sets")
	List<Set> all(){
		return repository.findAll();
	}
	
	@GetMapping("/sets/{id}")
	ResponseEntity<Set> getExpansion(@PathVariable String id) {
		Optional<Set> result = repository.findById(id);
		return ResponseEntity.of(result);
	}
	
	@PostMapping(value="/set",consumes="application/json")
	ResponseEntity<Set> createGroup(@RequestBody Set expansion) throws URISyntaxException {
		Set result = repository.save(expansion);
		return ResponseEntity.created(new URI("/expansions/" + result.getId())).body(result);
	}
	
	
//	@PutMapping("/expansion/{id}")
//	ResponseEntity<Expansion> updateExpansion(@RequestBody Expansion expansion){
//		Expansion result = repository.save(expansion);
//		return ResponseEntity.ok(result);
//	}

	@DeleteMapping("/set/{id}")
	public ResponseEntity<?> deleteExpansion(@PathVariable String id){
		repository.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
