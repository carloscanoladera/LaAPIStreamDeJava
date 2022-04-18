package operacionesterminales;

import java.util.Arrays;
import java.util.OptionalInt;

public class OperacionesTerminalesMaxMin {

	public static void main(String[] args) {
	int arrayEnteros[] =  new int[] {1, 2, 3,6,4,8,6,4,2,1, 5,6,7,8,6,5,8,7,9,10};
		
		System.out.println("\nPintamos el array");
		Arrays.stream(arrayEnteros).forEach(x->System.out.print(x+","));
		
		OptionalInt minimo = Arrays.stream(arrayEnteros).min();
		
		System.out.println ("\nEl número mínimo del array es:"+ minimo.getAsInt());
		
		
		Arrays.stream(arrayEnteros)
		.max()
		.ifPresent((num)->System.out.println ("El número máximo del array es:"+ num));
	}
	
	
	
	
}
