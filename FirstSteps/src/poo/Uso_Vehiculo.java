package poo;

public class Uso_Vehiculo {
	
	public static void main(String args[]) {
		
		/*
		import javax.swing.*;
		
		// Instanciando Clase
		Coche miCoche = new Coche();
		
		miCoche.set_color(JOptionPane.showInputDialog("Introduce color"));
		miCoche.set_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero? (si / no)"));
		miCoche.set_climatizador(JOptionPane.showInputDialog("Tiene Climatizador? (si / no)"));
		
		System.out.println(miCoche.Describe());
		*/
		
		Coche miCoche1 = new Coche();
		
		miCoche1.set_color("Azul");
		
		Furgoneta miFurgoneta1 = new Furgoneta(280, 4);
		
		miFurgoneta1.set_color("Blanco");
		miFurgoneta1.set_asientos("Si");
		miFurgoneta1.set_climatizador("Si");
		
		System.out.println(miFurgoneta1.Describe()+miFurgoneta1.get_Info_Furgoneta());
		
	}
}