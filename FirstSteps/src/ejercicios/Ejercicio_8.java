package ejercicios;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		// NUMEROS PRIMOS N REQUERIDOS

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese cuantos números desea: ");
		int solicitado = sc.nextInt();
		
		int a = 0;
		int b = 1;

		int suma = 0;
		
		while(a < solicitado) {
			if(esPrimo(b)) {
				System.out.print(b+"\t");
				suma += b;
				b++;
				a++;
			}else {
				b++;
			}
			
		}
		
		System.out.println("\nLa suma es: "+suma);
		System.out.println("El promedio es: "+suma/solicitado);

	}

	public static boolean esPrimo(int n) {

		// Calcular la mitad de N, tambien sirve
		for (int i = 2; i <= n/2; i++) {

			if (n % i == 0) {
				return false;
			}

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
