import javax.swing.JOptionPane;

public class Bucles_For_2 {

	public static void main(String[] args) {

		int arroba = 0;
		boolean punto = false;

		String mail = JOptionPane.showInputDialog("Introduce tu mail");

		for (int i = 0; i < mail.length(); i++) {

			// Importante comillas simple '' para un caracter
			if (mail.charAt(i) == '@') {

				arroba++;

			}

			if (mail.charAt(i) == '.') {

				punto = true;

			}

		}

		if (arroba == 1 && punto == true) {

			System.out.println("Es correcto");

		} else {

			System.out.println("No es correcto");

		}

	}

}
