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
public class ExpansionsController {
	private final ExpansionRepository repository;
	
	ExpansionsController(ExpansionRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/expansions")
	List<Expansion> all(){
		return repository.findAll();
	}
	
	@GetMapping("/expansions/{id}")
	ResponseEntity<Expansion> getExpansion(@PathVariable String id) {
		Optional<Expansion> result = repository.findById(id);
		return ResponseEntity.of(result);
	}
	
	@PostMapping(value="/expansion",consumes="application/json")
	ResponseEntity<Expansion> createGroup(@RequestBody Expansion expansion) throws URISyntaxException {
		Expansion result = repository.save(expansion);
		return ResponseEntity.created(new URI("/expansions/" + result.getId())).body(result);
	}
	
	
//	@PutMapping("/expansion/{id}")
//	ResponseEntity<Expansion> updateExpansion(@RequestBody Expansion expansion){
//		Expansion result = repository.save(expansion);
//		return ResponseEntity.ok(result);
//	}

	@DeleteMapping("/expansion/{id}")
	public ResponseEntity<?> deleteExpansion(@PathVariable String id){
		repository.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
