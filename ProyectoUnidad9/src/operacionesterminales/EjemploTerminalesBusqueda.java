package operacionesterminales;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploTerminalesBusqueda {
	
	public static void main(String[] args) {
		
String ArrayNombres[] ={"Al", "Ankit", "Brent", "Tomas", "Alejandro", "Aitor" ,"Sarika", "amanda", "Hans", "Shivika", "Sarah", "Julius"};
		
		
		
		
		
		Optional nombre =Stream.of(ArrayNombres)				
				.map(String::toLowerCase)
				.filter(x -> x.startsWith("a") || x.startsWith("b") )
				.findAny();
		
		if (nombre.isPresent()) {
			
			
			System.out.println("encontramos nombres que empiezan por A:" + nombre.get());
		} else {
			
			System.out.println("no encontramos nombres que empiezan por A" );
		} 
		
		Optional nombre2 =Stream.of(ArrayNombres)				
				.map(String::toLowerCase)
				.filter(x -> x.startsWith("a") || x.startsWith("b") )
				.findFirst();
		
		nombre2.ifPresent( s->	
			System.out.println("encontramos el primer nombre que empiezan por A:" + s));
		
		
		
		Optional nombre3 =Stream.of(ArrayNombres)				
				.map(String::toLowerCase)
				.filter(x -> x.startsWith("m"))
				.findFirst();
						
		if (nombre3.isPresent()) {

			System.out.println("encontramos nombres que empiezan por m:" + nombre.get());
		} else {

			System.out.println("no encontramos nombres que empiezan por m");
		}
				
		
	}

}
