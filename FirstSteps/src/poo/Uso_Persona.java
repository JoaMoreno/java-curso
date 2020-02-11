package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {

		Persona[] lasPersonas = new Persona[2];

		lasPersonas[0] = new Employee("Juan Lopez", 30000, 2019, 8, 14);
		lasPersonas[1] = new Alumno("Maria Lopez", "Informatica");

		for (Persona persona : lasPersonas) {

			// El metodo Describe() de Persona se reescribe en cada clase heredada

			System.out.println(persona.Describe());

		}

	}

}

// Una clase abstracta define el diseño de la jerarquia de herencia
abstract class Persona {

	public Persona(String name) {

		this.name = name;

	}

	public String get_Name() {

		return "Nombre: " + this.name;

	}

	public abstract String Describe();

	private String name;

}

class Employee extends Persona {

	public Employee(String name, double salary, int year, int month, int day) {

		super(name);

		this.id = idSiguiente;

		idSiguiente++;

		this.salary = salary;

		GregorianCalendar calendario = new GregorianCalendar(year, month - 1, day);

		this.altaContrato = calendario.getTime();

	}

	public int get_id() { // GETTER
		return id;
	}

	// Requiere un metodo Describe() definido por la super clase persona
	public String Describe() {

		return "ID: " + id + " Nombre: " + super.get_Name() + " Sueldo: " + salary;

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

	public void pay_Rise(double porcentaje) { // SETTER

		double aumento = salary * porcentaje / 100;

		salary += aumento;

	}

	private double salary;

	private Date altaContrato;

	private int id = 0;

	private static int idSiguiente = 1;

}

class Alumno extends Persona {

	public Alumno(String name, String carrera) {

		super(name);
		this.carrera = carrera;
	}

	// Requiere un metodo Describe() definido por la super clase persona
	public String Describe() {

		return "Nombre: " + super.get_Name() + " Carrera: " + carrera;

	}

	private String carrera;

}
