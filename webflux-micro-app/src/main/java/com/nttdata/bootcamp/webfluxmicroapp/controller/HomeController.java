package com.nttdata.bootcamp.webfluxmicroapp.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nttdata.bootcamp.webfluxmicroapp.service.PersonService;

import reactor.core.publisher.Flux;


//usar con controller
@Controller
public class HomeController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/home")
	public String mostrarhome(final Model model) {
		
		final Flux<Person> personList = personService.allPersons();
		
		model.addAttribute("personlist", personList);
		
		return "personlist";
		
	}
}
