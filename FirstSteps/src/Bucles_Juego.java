import java.util.Scanner;

public class Bucles_Juego {

	public static void main(String[] args) {

		int aleatorio = (int) (Math.random() * 100);

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		int numero = 0;
		int intentos = 0;

		do {

			intentos++;

			System.out.println("Introduce un numero");

			numero = entrada.nextInt();

			if (aleatorio < numero) {

				System.out.println("Te pasaste!");

			} else if (aleatorio > numero) {

				System.out.println("Te falta!");

			}

		} while (numero != aleatorio);

		System.out.println("Encontraste el numero! Lo has conseguido en " + intentos + " intentos");

	}

}
