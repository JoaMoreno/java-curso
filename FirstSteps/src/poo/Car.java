package poo;

public class Car {

	// Encapsulacion
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private int peso_total;
	private String color;
	private boolean asientos_cuero, climatizador;
	

	public Car() {

		ruedas = 4;
		largo = 700;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;

	}

	// Metodo GETTER
	public String Describe() {

		return (
				"Tiene "+ ruedas +" ruedas. \n"+
				"El color del coche es " + color +"\n"+
				"El largo del coche es " + largo +"\n"+
				"El ancho del coche es " + ancho +"\n"+
				"Tiene un motor " + motor +"\n"+
				"La plataforma pesa "+ peso_plataforma +" Kg \n"+
				
				tipo_asientos() +
				tipo_climatizador() + 
				set_peso_car()+"\n"+
				"El precio final es $"+precio_coche()
				
				);

	}
	
	public String tipo_asientos() {
		
		if(asientos_cuero == true) {
			
			return ("El coche tiene asientos de cuero \n");
			
		}else {
			
			return "El coche tiene asientos de serie \n";
			
		}
		
	}
	
	public String tipo_climatizador() {
		
		if(climatizador) {
			
			return "El coche incorpora climatizador \n";
			
		}else {
			
			return "El coche lleva aire acondicionado \n";
			
		}
		
	}
	
	// Metodo SETTER
	public void set_color(String color_car) {
		
		color = color_car;
	}
	
	public void set_asientos(String asientos_cuero) {
		
		if(asientos_cuero.equalsIgnoreCase("si") == true) {
			
			this.asientos_cuero = true;
			
		}else {
			
			this.asientos_cuero = false;
			
		}
	}
	
	public void set_climatizador(String climatizador) {
		
		if(climatizador.equalsIgnoreCase("si")==true) {
			
			this.climatizador = true;
			
		}else {
			
			this.climatizador = false;
			
		}
	}
	
	// SETTER + GETTER ( ! No recomendada )
	public String set_peso_car() {
		
		int peso_carroceria = 500;
		
		peso_total = peso_plataforma + peso_carroceria;
		
		if(asientos_cuero) {
			peso_total += 50;
		}
		if(climatizador) {
			peso_total += 20;
		}
		
		return "El peso del coche es " + peso_total + " kg";
		
	}
	
	public int precio_coche() {
		
		int precio_final = 10000;
		
		if(asientos_cuero) {
			precio_final += 2000;
		}
		if(climatizador) {
			precio_final += 1500;
		}
		
		return precio_final;
		
	}

}
