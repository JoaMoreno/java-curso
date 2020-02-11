package poo;

public class Furgoneta extends Coche{

	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta(int capacidad_carga, int plazas_extra) {
		
		super(); // Llama al constructor de la clase padre
		
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
		
	}
	
	// GETTER
	public String get_Info_Furgoneta() {
		
		return "\nCapacidad de carga: "+capacidad_carga+" kg\n"+
			   "Plazas extra: "+plazas_extra+"\n";
		
	}
	
}
