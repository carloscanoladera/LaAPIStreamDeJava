package operacionesterminales;

import java.util.Arrays;
import java.util.stream.Stream;

public class EjemploOperacionesTerminales2 {
	
	
	public static void main(String[] args) {
	
	String[] frases =
		{"En el siguiente ejemplo vamos a transformar una cadena en un array de cadenas"
				,"separando cada palabra ","y agregandola a un array de Strings"};
	
	
	
	long numpalabras =Stream.of(frases).
	flatMap((valor) -> {
	    String[] palabras = valor.split(" ");
	    return (Stream<String>) Arrays.stream(palabras);
	}).count();
	
	
	System.out.println("El número de palabras en el array es: " + numpalabras);
	
	

			
			
			System.out.println("El número de palabras en el array es: " + Stream.of(frases).
					flatMap((valor) -> {
					    String[] palabras = valor.split(" ");
					    return (Stream<String>) Arrays.stream(palabras);
					}).count());
	
	}

}
