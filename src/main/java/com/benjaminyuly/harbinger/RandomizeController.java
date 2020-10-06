package com.benjaminyuly.harbinger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RandomizeController {
	
	@GetMapping("/randomize")
	public String RandomizeGame(@RequestParam(required = false)String expansion, Model model) {
		model.addAttribute("expansion", expansion);
		return "randomized";
	}
	

}
