package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {

		/*
		 * Employee empleado1 = new Employee("Juan Lopez", 85000, 1990,12,17);
		 * 
		 * Employee empleado2 = new Employee("Ana Gómez", 85000, 1995,10,13);
		 * 
		 * Employee empleado3 = new Employee("Maria Martin", 105000, 2002,03,27);
		 * 
		 * empleado1.pay_Rise(5);
		 * 
		 * empleado2.pay_Rise(8);
		 * 
		 * System.out.println(empleado1.Describe());
		 * System.out.println(empleado2.Describe());
		 * System.out.println(empleado3.Describe());
		 */

		Jefatura jefe_RRHH = new Jefatura("Juan Andres", 80000, 1992, 03, 24);

		jefe_RRHH.set_Incentivo(5000);

		Empleado[] misEmpleados = new Empleado[5];

		misEmpleados[0] = new Empleado("Juan Lopez", 30000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana Gómez", 32000, 1995, 10, 13);
		misEmpleados[2] = new Empleado("Maria Martin", 40000, 2002, 03, 27);
		misEmpleados[3] = jefe_RRHH; // Polimorfismo, Principio de sustitucion
		misEmpleados[4] = new Jefatura("Alicia Mora", 80000, 1999, 05, 19);

		// Refundicion, Casting de objetos
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[4];
		jefa_Finanzas.set_Incentivo(8000);

		/*
		 * El diseño de las clases no permite que un "Empleado" obtenga metodos de
		 * "Jefatura". Jefatura jefa_Compras = (Jefatura) misEmpleados[1];
		 */

		for (int i = 0; i < misEmpleados.length; i++) {

			misEmpleados[i].pay_Rise(5);

		}

		// for each
		for (Empleado e : misEmpleados) {

			// get_salary se comporta distinto segun tipo Empleado o tipo Jefatura
			System.out.println("ID " + e.get_id() + " | Nombre: " + e.get_name() + " Sueldo: " + e.get_Salary());

		}
		
		System.out.println(Empleado.get_NextId());
	}

}

class Empleado {

	public Empleado(String name, double salary, int year, int month, int day) {

		this.id = idSiguiente;

		idSiguiente++;

		this.name = name;

		this.salary = salary;

		GregorianCalendar calendario = new GregorianCalendar(year, month - 1, day);

		this.altaContrato = calendario.getTime();

	}

	public Empleado(String name) {

		this(name, 3000, 2000, 01, 01);

	}

	public int get_id() { // GETTER
		return id;
	}

	public String get_name() { // GETTER
		return name;
	}

	public double get_Salary() { // GETTER
		return salary;
	}

	public Date get_Date() { // GETTER
		return altaContrato;
	}
	
	public static String get_NextId() {

		return "ID " + idSiguiente + " | Next";

	}

	public String Describe() {
		return ("ID " + id + "| Nombre: " + name + " Sueldo: $" + salary + " Fecha de Alta: " + altaContrato);
	}

	public void pay_Rise(double porcentaje) { // SETTER

		double aumento = salary * porcentaje / 100;

		salary += aumento;

	}

	private String name;

	private double salary;

	private Date altaContrato;

	private int id = 0;

	private static int idSiguiente = 1;

}

class Jefatura extends Empleado {

	public Jefatura(String name, double salaty, int year, int month, int day) {
		super(name, salaty, year, month, day);
	}

	// GETTER
	public double get_Salary() {

		double sueldoJefe = super.get_Salary();

		return sueldoJefe + incentivo;

	}

	// SETTER
	public void set_Incentivo(double b) {

		incentivo = b;

	}

	private double incentivo;

}
