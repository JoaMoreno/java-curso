package ejercicios;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		// CALCULAR NUMERO e

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos términos de precisión desea: ");
		int num = sc.nextInt();

		System.out.println("e = " + e(num));

	}

	public static double e(int n) {

		double s = 0, t;

		for (int i = 0; i < n; i++) {

			t = 1 / Factorial(i);

			s += t;

		}

		return s;

	}

	public static double Factorial(int n) {
		long num = 1;

		for (int i = 0; i < n; i++) {

			num *= (i+1);

		}

		return num;
	}

}
