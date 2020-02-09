import javax.swing.*;

public class Arrays_2 {

	public static void main(String[] args) {

		// String[] paises = { "España", "Mexico", "Colombia", "Perú", "Chile",
		// "Argentina", "Ecuador", "Venezuela" };

		String[] paises = new String[8];

		/*
		 * for(int i=0; i < paises.length; i++) {
		 * 
		 * System.out.println("Páis "+ (i+1) +" " + paises[i]);
		 * 
		 * }
		 */

		for (int i = 0; i < paises.length; i++) {

			paises[i] = JOptionPane.showInputDialog("Introduce un Páis " + (i + 1));

		}

		// for each
		for (String elemento : paises) {

			System.out.println("Páis " + elemento);

		}

	}

}
