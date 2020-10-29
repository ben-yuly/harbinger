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
public class CardController {
	private final CardRepository cardRepository;
	
	CardController(CardRepository repository) {
		this.cardRepository = repository;
	}
	
	@GetMapping("/cards")
	List<Card> all(){
		return cardRepository.findAll();
	}
	
	@GetMapping("/cards/{id}")
	ResponseEntity<Card> getCard(@PathVariable String id) {
		Optional<Card> result = cardRepository.findById(id);
		return ResponseEntity.of(result);
	}
	
	@PostMapping(value="/card",consumes="application/json")
	ResponseEntity<Card> createCard(@RequestBody Card card) throws URISyntaxException {
		Card result = cardRepository.save(card);
		return ResponseEntity.created(new URI("/cards/" + result.getId())).body(result);
	}
	
	
//	@PutMapping("/card/{id}")
//	ResponseEntity<Expansion> updateCard(@RequestBody Expansion expansion){
//		Expansion result = repository.save(expansion);
//		return ResponseEntity.ok(result);
//	}

	@DeleteMapping("/card/{id}")
	public ResponseEntity<?> deleteCard(@PathVariable String id){
		cardRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
