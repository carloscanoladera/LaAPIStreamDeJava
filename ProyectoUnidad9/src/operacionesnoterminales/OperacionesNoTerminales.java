package operacionesnoterminales;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OperacionesNoTerminales {

	public static void main(String[] args) {

		
	
		String ArrayNombres[] ={"borito", "Antonio", "Len", "Titus", "Alejandro", "Aitor" ,"Sarika", "amanda", "Hans", "Shivika", "Sarah", "Julius"};
		
		
		Stream.of(ArrayNombres)		
		.filter(x -> x.startsWith("a") || x.startsWith("b") || x.startsWith("s") )
		.forEach(System.out::println);
		
		Stream.of(ArrayNombres)		
		.filter(x -> x.length()> 4 )
		.forEach(System.out::println);
		
		
		Stream.of(ArrayNombres)				
				.map(String::toLowerCase)
				.filter(x -> x.startsWith("a") || x.startsWith("b") || x.startsWith("s") )
				.forEach(System.out::println);
		
		
		String[] frases =
			{"En el siguiente ejemplo vamos a transformar una cadena en un array de cadenas"
					,"separando cada palabra ","y agregandola a un array de Strings"};
		
		
		
		Stream.of(frases).
		flatMap((valor) -> {
		    String[] palabras = valor.split(" ");
		    return (Stream<String>) Arrays.stream(palabras);
		})
		.forEach((valor) -> System.out.print(valor+","));
		
		
			
			
	}

}
