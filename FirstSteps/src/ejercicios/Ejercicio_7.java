package ejercicios;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		// NUMEROS PRIMOS

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un Numero: ");
		int solicitado = sc.nextInt();

		if (esPrimo(solicitado)) {
			System.out.println("El numero " + solicitado + ", SI es primo");
		} else {
			System.out.println("El numero " + solicitado + ", No es primo");
		}

	}

	public static boolean esPrimo(int n) {

		for (int i = 2; i <= n; i++) {

			if (n % i == 0)
				return false;

		}
		return true;

	}

	/* ¡Para Optimizar!
	 * Para saber si un número es primo basta con probar si el número no es divisible por
	 * los primos hasta su raiz cuadrada.
	 * 
	 * La raiz cuadrada de 149 es 12,2… por lo que solo es necesario probar los
	 * números primos hasta 12,2..
	 * 
	 * 149 : 2 = 74,5.. (no es divisible por 2) 149 : 3 = 49,6.. (no es divisible
	 * por 3) 149 : 5 = 29,8.. (no es divisible por 5) 149 : 7 = 21,2.. (no es
	 * divisible por 7) 149 : 11 = 13,5.. (no es divisible por 11)
	 * 
	 * 149 no puede ser dividido por estos primos por tanto 149 es un número primo
	 */

}
