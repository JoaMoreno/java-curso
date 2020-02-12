package ejercicios;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// EL FACTORIAL DE UN NUMERO

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos números desea: ");
		int numero = sc.nextInt();

		long num =1;

		for (int i = 0; i < numero; i++) {
			
			num *= (i+1);
			
		}
		
		System.out.println("\nEl factorial es: " + num);

	}

}
