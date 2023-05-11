package com.nttdata.bootcamp.webfluxdemo.controller;

import java.time.Duration;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class Controller {
		@GetMapping(path="/numbers", produces ="text/event-stream")
		public Flux<Integer> numbers(){
			return Flux.range(1, 30).delayElements(Duration.ofSeconds(1));
			
		
		}
}
