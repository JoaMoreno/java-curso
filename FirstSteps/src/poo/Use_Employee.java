package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Use_Employee {

	public static void main(String[] args) {
		
		/*
		Employee empleado1 = new Employee("Juan Lopez", 85000, 1990,12,17);

		Employee empleado2 = new Employee("Ana Gómez", 85000, 1995,10,13);
		
		Employee empleado3 = new Employee("Maria Martin", 105000, 2002,03,27);
		
		empleado1.pay_Rise(5);
		
		empleado2.pay_Rise(8);
		
		System.out.println(empleado1.Describe());
		System.out.println(empleado2.Describe());
		System.out.println(empleado3.Describe());
		*/
		
		Employee[] misEmpleados = new Employee[3];
		
		misEmpleados[0] = new Employee("Juan Lopez", 85000, 1990,12,17);
		misEmpleados[1] = new Employee("Ana Gómez", 85000, 1995,10,13);
		misEmpleados[2] = new Employee("Maria Martin", 105000, 2002,03,27);
		
		for (int i = 0; i < misEmpleados.length; i++) {
			
			misEmpleados[i].pay_Rise(5);
			
		}
		
		// for each
		for (Employee e: misEmpleados) {
			
			System.out.println(e.Describe());
			
		}
	}

}

class Employee {
	
	public Employee(String name, double salary, int year, int month, int day) {
		
		this.name = name;
		
		this.salary = salary;
		
		GregorianCalendar calendario = new GregorianCalendar(year, month-1, day);
		
		this.altaContrato = calendario.getTime();
		
	}
	
	public String get_name() { // GETTER
		return name;
	}
	
	public double get_salary() { // GETTER
		return salary;
	}
	
	public Date get_Date() { // GETTER
		return altaContrato;
	}
	
	public String Describe() {
		return (
				"Nombre: "+ name+"\n"+
				"Sueldo: "+ salary+"\n"+
				"Fecha de Alta: "+ altaContrato+"\n"
				);
	}
	
	
	
	public void pay_Rise(double porcentaje) { // SETTER
		
		double aumento = salary * porcentaje / 100;
		
		salary += aumento;
		
	}
	
	
	
	
	private String name;
	
	private double salary;
	
	private Date altaContrato;
	
}