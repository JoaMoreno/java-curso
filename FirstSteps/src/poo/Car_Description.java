package poo;

import javax.swing.*;

public class Car_Description {
	
	public static void main(String args[]) {
		
		// Instanciando Clase
		Car miCoche = new Car();
		
		miCoche.set_color(JOptionPane.showInputDialog("Introduce color"));
		miCoche.set_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero? (si / no)"));
		miCoche.set_climatizador(JOptionPane.showInputDialog("Tiene Climatizador? (si / no)"));
		
		System.out.println(miCoche.Describe());
	}
}