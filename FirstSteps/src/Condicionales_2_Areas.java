import java.util.*;
import javax.swing.*;

public class Condicionales_2_Areas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(
				"Elige una opcion: \n1 : Cuadrado \n2 : Rectangulo \n3 : Triangulo \n4 : Circulo");

		int figura = entrada.nextInt();

		switch (figura) {
		case 1:
			
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado: "));
			
			
			
			System.out.println();
			
			break;

		default:
			break;
		}
		
	}

}
