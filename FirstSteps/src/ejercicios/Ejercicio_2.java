package ejercicios;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// A�O BICIESTO
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un a�o: ");
		int year = sc.nextInt();
		
		if((year % 4)==0) {
			
			if((year % 100)==0) {
				
				if((year % 400)==0) {
					System.out.println("El a�o si es biciesto");
				}else {
					System.out.println("El a�o no es biciesto");
				}
				
			}else {
				System.out.println("El a�o si es biciesto");
			}
			
		}else {
			System.out.println("El a�o no es biciesto");
		}

	}

}
