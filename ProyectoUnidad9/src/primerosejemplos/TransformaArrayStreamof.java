package primerosejemplos;

import java.util.Arrays;
import java.util.stream.Stream;

public class TransformaArrayStreamof {
	
	
	public static void main(String[] args) {
		
		
		 String miArray[] = {"a1", "a2", "b1", "c2", "c1"};
		 
		 Stream<String> streamArray = Stream.of(miArray); 

		 streamArray			  
			    .forEach(System.out::println);
		 
		 System.out.println("Filtramos quedandonos con los que empiecen por c  y los transformamos a mayusculas");
		
		 Stream.of(miArray)
		 .filter(s -> s.startsWith("c"))
		    .map(String::toUpperCase)
		    .sorted()
		    .forEach(System.out::println);
	
	}

}
