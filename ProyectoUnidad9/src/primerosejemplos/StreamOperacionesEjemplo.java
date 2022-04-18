package primerosejemplos;

import java.util.Arrays;

public class StreamOperacionesEjemplo {
	
	
	public static void main(String[] args) {
		
		System.out.println("Array de numeros");
		
		Arrays.stream(new int[] {1, 2, 3,4,5,6,7,8,9,10})
		.forEach( x->System.out.print(x+","));  
		
		System.out.println("\nFiltramos por números pares");
		
		Arrays.stream(new int[] {1, 2, 3,4,5,6,7,8,9,10})
		.filter(n->n%2==0)
		.forEach( x->System.out.print(x+","));   // 
		
		System.out.println("\nFiltramos por números pares y multiplicamos cada numero par por dos y le sumamos 1");
		Arrays.stream(new int[] {1, 2, 3,4,5,6,7,8,9,10})
		.filter(n->n%2==0)
		.map(n -> 2 * n + 1)
		.forEach( x->System.out.print(x+","));  
		
		System.out.println("\nFiltramos por números pares y multiplicamos cada numero par por dos y le sumamos 1. Calculamos la media");
		Arrays.stream(new int[] {1, 2, 3,4,5,6,7,8,9,10})
		.filter(n->n%2==0)
		.map(n -> 2 * n + 1)
		.average()
		.ifPresent(System.out::println);  
		
	}


}


