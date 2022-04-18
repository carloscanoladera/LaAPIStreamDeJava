package primerosejemplos;

import java.util.Arrays;

public class ConvertirStreamArray {
	
	public static void main(String[] args) {
		
		System.out.println("\nFiltramos por números impares y creamos un nuevo array ordenado");
		
		int arrayImpares[] = Arrays.stream(new int[] {1, 7,6 ,5,2,3,4,8,9,10})
		.filter(n->n%2!=0)
		.sorted()		
		.toArray();
		
		
		Arrays.stream(arrayImpares).forEach(x->System.out.print(x+","));
	}
}
