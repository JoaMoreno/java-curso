import javax.swing.JOptionPane;

public class Data_Entry2 {

	public static void main(String[] args) {

		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre: ");

		//shouInputDiaLog return a String
		String edad = JOptionPane.showInputDialog("Introduce tu edad: ");
		
		// String to int whit parseInt
		int edad_usuario = Integer.parseInt(edad);

		System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad_usuario+1) + " años");

	}

}
