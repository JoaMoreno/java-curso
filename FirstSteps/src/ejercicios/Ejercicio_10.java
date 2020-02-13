package ejercicios;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		// CALCULAR NUMERO PI

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos términos de precisión desea: ");
		int num = sc.nextInt();

		int a = 0;
		
		double b = 1;

		double suma = 0, t = 0;

		double denominador = 1;

		while (a < num) {

			if (a % 2 == 0) {

				t = 1 / denominador;
				suma += t;

				// System.out.println(1+" / "+denominador+" = "+t);

				denominador += 2;

				b++;
				a++;

			} else {

				t = 1 / denominador;
				suma -= t;

				// System.out.println(1+" / "+denominador+" = "+t);

				denominador += 2;

				b++;
				a++;

			}

		}

		System.out.println("pi = " + suma * 4);

	}

}
