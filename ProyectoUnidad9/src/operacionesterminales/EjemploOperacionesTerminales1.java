package operacionesterminales;

import java.util.Arrays;

public class EjemploOperacionesTerminales1 {
	
	public static void main(String[] args) {
		
		
		String[] frases =
			{"En el siguiente ejemplo hay que", " entablar cadenas"
					,"en caso de que empiecen por ","en da igual mayuscula o minúscula", 
					" solo si empiezan por en nos devolverá verdadero"};
		
	
		
		
		boolean algunoEmpiezaPoren= Arrays.stream(frases).anyMatch((value) -> { return  value.toLowerCase().startsWith("en"); });
		
		
		if (algunoEmpiezaPoren) {
			
			System.out.println("Alguna de las frases empieza por 'en'");
			
		}
		
		boolean todasEmpiezanPoren= Arrays.stream(frases).allMatch((value) -> { return  value.toLowerCase().startsWith("en"); });


		if (!todasEmpiezanPoren) {
			
			System.out.println("No todas las frases empieza por 'en'");
			
		}
		
		
	}

}
