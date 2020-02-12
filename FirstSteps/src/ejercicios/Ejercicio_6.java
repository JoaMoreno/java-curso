package ejercicios;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		// SERIE FIBONACCI

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos números desea: ");
		int solicitados = sc.nextInt();

		int numero1 = 0;
		int numero2 = 1;
		int numero3 = 2;

		int a;
		
		int suma = 3;

		// System.out.print(numero1+"\t"+numero2+"\t");

		for (int i = 3; i < solicitados; i++) {

			a = numero1 + numero2 + numero3;
			suma += a;
			
			if (i % 10 == 0) {
				System.out.println(a + "\t");
			} else {
				System.out.print(a + "\t");
			}
			
			numero1 = numero2;
			numero2 = numero3;
			numero3 = a;
		}

		System.out.println("\nLa suma es: " + suma);

	}

}
