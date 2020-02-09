import javax.swing.JOptionPane;

public class Bucles_For_3 {

	public static void main(String[] args) {

		Long resultado = 1L;

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));

		for (int i = numero; i > 0; i--) {

			resultado = resultado * i;

		}

		System.out.println("El factorial de " + numero + " es " + resultado);

	}

}
