import java.util.Scanner;

public class Data_Entry {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu nombre: ");

		String nombre_usuario = entrada.nextLine();

		System.out.println("Introduce tu edad: ");

		int edad = entrada.nextInt();

		System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad + 1) + " años");

	}

}
