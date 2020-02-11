package ejercicios;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// ES UN NUMERO MULTIPLO DE OTRO
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese primer número: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Ingrese segundo número: ");
		int numero2 = sc.nextInt();
		
		if((numero1 % numero2)==0) {
			System.out.println("El número "+numero2+", es múltiplo de "+numero1);
		}else {
			System.out.println("El número "+numero2+", NO es múltiplo de "+numero1);
		}

	}

}
