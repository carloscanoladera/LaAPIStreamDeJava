package operacionesnoterminales;

import java.util.Arrays;
import java.util.stream.Stream;



	class Empleado {
		
		int id;
		String nombre;
		public Empleado (int id, String nombre) {
			
			this.id=id;
			this.nombre=nombre;
			
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		
		public String toString () {
			
		return "{id:"+ this.getId() + ", nombre:" + this.getNombre() + "}";
		}
		
	}
	
	public class MapEmpleados {
		
	public static final Integer numeros[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
	
	  public static final String nombres[] = {"ANTONIO", "MANUEL", "JOSE", "FRANCISCO", "DAVID", "JUAN", "JOSE ANTONIO", "JAVIER", "DANIEL", "JOSE LUIS", "FRANCISCO JAVIER",
	            "CARLOS", "JESUS", "ALEJANDRO", "FRANCISCA", "LUCIA", "MARIA ISABEL", "MARIA JOSE", "ANTONIA", "DOLORES", "SARA",
	            "PAULA", "ELENA", "MARIA LUISA", "RAQUEL"};

	
	
	public MapEmpleados() {
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		 Object empleados[] = 
				 Arrays.stream(numeros).map((num) -> (Empleado) new Empleado(num,nombres[num])).toArray();
		
		
		 Arrays.stream(empleados).forEach((objEmpleado) -> System.out.println(((Empleado) objEmpleado)));
		 
		}
		
	
	
	
	
}
