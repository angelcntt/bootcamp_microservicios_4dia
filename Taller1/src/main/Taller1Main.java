package main;

import java.util.List;

public class Taller1Main {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(18, 6, 4 ,15,55, 78, 12 ,9 ,8); 
		//Imperativa 
		for( Integer i:numbers ) {
			if(i>10) {
				System.out.println(i+ " es mayor que 10");
			}
		}

		numbers.stream().filter(n ->(n >10)).forEach(System.out::println);
		
		//funcional
	}

}
