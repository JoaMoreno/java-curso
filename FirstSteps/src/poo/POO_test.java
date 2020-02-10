package poo;

public class POO_test {

	public static void main(String[] args) {
		
		Empleados trabajador1 = new Empleados("Juan Lopez");
		
		Empleados trabajador2 = new Empleados("Ana Gómez");
		
		Empleados trabajador3 = new Empleados("Maria Guzman");
		
		trabajador1.cambia_Seccion("RRHH");
		
		System.out.println(trabajador1.get_Data());
		
		System.out.println(trabajador2.get_Data());
				
		System.out.println(trabajador3.get_Data());
		
		System.out.println(Empleados.get_NextId());

	}

}

class Empleados{
	
	private int id = 0;
	
	private static int idSiguiente = 1;
	
	private final String name;
	
	private String seccion;
	
	// Constructor
	public Empleados(String name) {
		
		this.id = idSiguiente;
		idSiguiente++;
		
		this.name = name;
		
		this.seccion = "Administración";
		
	}
	
	//SETTER
	public void cambia_Seccion(String seccion) {
		
		this.seccion = seccion;
		
	}
	
	//GETTER
	public String get_Data() {
		
		return "ID "+id+"| Nombre: "+name+" Seccion: "+seccion;
		
	}
	
	/* "Métodos static"
	 * No actúan sobre objetos.
	 * No acceden a campos de ejemplar (variables / constantes declaradas en la clase),
	 * a menos que estas sean tambien static.
	 * Para llamarlos se utiliza el nombre_clase.nombre_metodo
	 * */
	public static String get_NextId() {
		
		return "ID "+idSiguiente+"| < Next";
		
	}
	
}