package ejercicios;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// SUMA DE N NUMEROS

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos números desea: ");
		int numero = sc.nextInt();

		int suma = 0;

		for (int i = 0; i < numero; i++) {

			suma += i+1;

			if ((i + 1) % 15 == 0) {
				System.out.println((i + 1) + " ");
			} else {
				System.out.print((i + 1) + " ");
			}

		}

		System.out.println("\nLa suma es: " + suma);
		System.out.println("El promedio es: " + suma/numero);

	}

}
