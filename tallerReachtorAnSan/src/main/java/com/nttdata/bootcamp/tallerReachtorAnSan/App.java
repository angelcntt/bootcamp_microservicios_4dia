package com.nttdata.bootcamp.tallerReachtorAnSan;



import java.util.function.Consumer;


import reactor.core.publisher.Flux;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Flux<String> Publisher = Flux.just("First","Second","Third");
      
      
      
      
      Publisher.subscribe(new FirstConsumer());
      Publisher.subscribe(new SecondConsumer());
    }
}

class FirstConsumer implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t+" first Consumer");
		
	}
	
}

class SecondConsumer implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t+" second Consumer");
		
	}
	
	
}
