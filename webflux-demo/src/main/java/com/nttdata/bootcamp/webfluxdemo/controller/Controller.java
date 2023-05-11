package com.nttdata.bootcamp.webfluxdemo.controller;

import java.time.Duration;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class Controller {
		
		@GetMapping(path="/numbers", produces ="text/event-stream")
		public Flux<Integer> numbers(){
			return Flux.range(1, 30).delayElements(Duration.ofSeconds(1));
			
		
		}
		
		@GetMapping(path="/numbers-with-subscribers",produces ="text/event-stream")
		public Flux<Integer> numbersWithSubscribers(){
			Flux<Integer> flux = Flux.range(1, 20).delayElements(Duration.ofSeconds(1));
			
			flux.subscribe(n-> {
				try {
					Subscriber.print(n);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			flux.subscribe(n-> System.out.println("Subscriber 2 "+n));
			
			return flux;
		}
}
