package com.nttdata.bootcamp.webfluxmicroserver.Controller;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.webfluxmicroserver.Classes.Person;

import reactor.core.publisher.Flux;

@RestController
public class PersonListController {
	
	@GetMapping("/person-list-1")
	public Flux<Person> personList1(){
		Flux<Person> fluxper=Flux.just(new Person("p1list1","apP1list1",1),new Person("p2list1","apP2list1",2)).delayElements(Duration.ofSeconds(1));
		return fluxper;
	}
	
	@GetMapping("/person-list-2")
	public Flux<Person> personList2(){
		Flux<Person> fluxper=Flux.just(new Person("p1list2","apP1list2",1),new Person("p2list2","apP2list2",2)).delayElements(Duration.ofSeconds(2));
		return fluxper;
	}
	
	@GetMapping("/person-list-3")
	public Flux<Person> personList3(){
		Flux<Person> fluxper=Flux.just(new Person("p1list2","apP1list2",1),new Person("p2list2","apP2list2",2)).delayElements(Duration.ofSeconds(3));
		return fluxper;
	}
	
	@GetMapping("/person-list-4")
	public Flux<Person> personList4(){
		Flux<Person> fluxper=Flux.just(new Person("p1list2","apP1list2",1),new Person("p2list2","apP2list2",2)).delayElements(Duration.ofSeconds(4));
		return fluxper;
	}
	
}
