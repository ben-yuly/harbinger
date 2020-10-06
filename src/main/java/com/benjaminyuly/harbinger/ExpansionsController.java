package com.benjaminyuly.harbinger;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpansionsController {
	private final ExpansionRepository repository;
	
	ExpansionsController(ExpansionRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/expansions")
	List<Expansion> all(){
		return repository.findAll();
	}
	
	
	

}
