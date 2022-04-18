package operacionesnoterminales;

import java.util.Arrays;

public class OperacionesNoTerminales2 {
	
	public static void main(String[] args) {
	int arrayEnteros[] =  new int[] {1, 2, 3,6,4,8,6,4,2,1, 5,6,7,8,6,5,8,7,9,10};
	
	System.out.println("\nPintamos el array");
	Arrays.stream(arrayEnteros).forEach(x->System.out.print(x+","));
	System.out.println("\nPintamos el array ordenado sin duplicados");
	Arrays.stream(arrayEnteros).
	sorted().
	distinct().
	forEach(x->System.out.print(x+","));
	
	

	System.out.println("\nPintamos el array limitado a 4");
	Arrays.stream(arrayEnteros).
	limit(4).
	sorted().
	forEach(x->System.out.print(x+","));
	
	
	
	System.out.println("\nPintamos el array , y luego una coma despues de cada elemento pintado");
	int arrayEnterosPeek[]=Arrays.stream(arrayEnteros).
	peek(x->System.out.print(x+",")).toArray();
	
	
	}

}
