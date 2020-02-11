package ejercicios;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// AÑO BICIESTO
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un año: ");
		int year = sc.nextInt();
		
		if((year % 4)==0) {
			
			if((year % 100)==0) {
				
				if((year % 400)==0) {
					System.out.println("El año si es biciesto");
				}else {
					System.out.println("El año no es biciesto");
				}
				
			}else {
				System.out.println("El año si es biciesto");
			}
			
		}else {
			System.out.println("El año no es biciesto");
		}

	}

}
