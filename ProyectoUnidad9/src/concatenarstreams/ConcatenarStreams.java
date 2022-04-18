package concatenarstreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatenarStreams {

	public static void main(String[] args) {

		
		
		String ArrayNombres[] ={"forito", "Antonio", "Len", "Titus", "Alejandro", "Aitor" ,"Sarika", "amanda", "Hans", "Shivika", "Sarah", "Julius"};
	
		String ArrayNombres2[] ={"lodi", "samuel" ,"iker" , "Jeronimo", "Gracielo", "Rene","Reus"};
		
		Stream<String> stream1 =Arrays.stream(ArrayNombres);
		
		Stream<String> stream2 =Arrays.stream(ArrayNombres2);
		
		Stream<String> stream3 = Stream.concat(stream1, stream2);
		System.out.println("Concatemos los dos Stream arrays y obtenemos uno con los elementos de los dos");
		stream3.forEach(x->System.out.print(x+","));
		
		
	}
	
}
