package ejercicios;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// ES UN NUMERO MULTIPLO DE OTRO
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese primer n�mero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Ingrese segundo n�mero: ");
		int numero2 = sc.nextInt();
		
		if((numero1 % numero2)==0) {
			System.out.println("El n�mero "+numero2+", es m�ltiplo de "+numero1);
		}else {
			System.out.println("El n�mero "+numero2+", NO es m�ltiplo de "+numero1);
		}

	}

}
