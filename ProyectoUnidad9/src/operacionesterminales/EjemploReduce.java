package operacionesterminales;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploReduce {
	
	public static void main(String[] args) {

	String ArrayNombres[] ={"Al", "Ankit", "Brent", "Tomas", "Alejandro", "Aitor" ,"Sarika", "amanda", "Hans", "Shivika", "Sarah", "Julius"};
	
	
	Optional concatenacion = Stream.of(ArrayNombres).reduce((strCombinado, str)-> strCombinado+str );
	
	concatenacion.ifPresent(System.out::println);
	
	
	
	Stream.of(ArrayNombres).parallel()
	.reduce((strCombinado, str)-> strCombinado+str)
	.ifPresent(System.out::println);
	
	}

}
