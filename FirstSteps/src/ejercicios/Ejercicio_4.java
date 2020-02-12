package ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// SERIE FIBONACCI

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos números desea: ");
		int solicitados = sc.nextInt();

		int numero1 = 0;
		int numero2 = 1;
		int numero3;
		
		int suma = 1;
		
		//System.out.print(numero1+"\t"+numero2+"\t");
		
		for (int i = 1; i < solicitados; i++) {
			
			numero3 = numero1 + numero2;
			suma += numero3;
			
			if(i%10==0) {
				System.out.println(numero3+"\t");
			}else {
				System.out.print(numero3+"\t");
			}
			
			numero1= numero2;
			numero2= numero3;
		}

		System.out.println("\nLa suma es: "+suma);
		
	}

}
