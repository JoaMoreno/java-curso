
public class Cadenas_texto {

	public static void main(String[] args) {

		String nombre="Joaquin";
		
		System.out.println("Mi nombre es "+ nombre);
		
		System.out.println("Mi nombre tiene "+ nombre.length() +" letras");
		
		System.out.println("La primera letra es la "+ nombre.charAt(0));
		
		int ultima_letra = nombre.length();
		
		System.out.println("La ultima letra es la "+ nombre.charAt(ultima_letra-1));

	}

}
