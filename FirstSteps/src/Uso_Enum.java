import java.util.Scanner;

public class Uso_Enum {

	// Tipos enumerados
	// enum Talle {MINI,MEDIANO,GRANDE,MUY_GRANDE};

	enum Talla {

		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

		private Talla(String abreviatura) {

			this.abreviatura = abreviatura;

		}

		// GETTER
		public String get_Abreviatura() {
			return abreviatura;
		}

		private String abreviatura;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
		String entrada_datos = sc.next().toUpperCase();

		Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);

		System.out.println("Talla: " + la_talla);

		System.out.println("Abreviatura: " + la_talla.get_Abreviatura());
	}

}