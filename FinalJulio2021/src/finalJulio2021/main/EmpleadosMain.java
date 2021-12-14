package finalJulio2021.main;

import java.util.ArrayList;
import java.util.List;

import finalJulio2021.modelo.Empleado;
import finalJulio2021.modelo.Empleados;

public class EmpleadosMain {
	public static void main(String[] args) {
		 Empleados listaEmpleados = new Empleados(); 
		 
		 listaEmpleados.agregarEmpleado(new Empleado("Josy", 1234));
		 listaEmpleados.agregarEmpleado(new Empleado("Josy", 1234));
		 listaEmpleados.agregarEmpleado(new Empleado("Pepe", 1238));
		 listaEmpleados.agregarEmpleado(new Empleado("Juan", 1220));
		 listaEmpleados.agregarEmpleado(new Empleado("Juan", 1220));
		 listaEmpleados.agregarEmpleado(new Empleado("Juan", 1220));
		 listaEmpleados.agregarEmpleado(new Empleado("Maria", 1230));
		 
		 System.out.println("Lista Empleados ordenados por DNI");
		 listaEmpleados.ordenarEmpleados();
		 
		 List<Empleado> empleadosRepetidosTest = new ArrayList<Empleado>();
		 
		 empleadosRepetidosTest = listaEmpleados.devolverRepetidos();
		 
		 System.out.println("Empleados Repetidos");
		 
		 for (Empleado empleado: empleadosRepetidosTest)
				System.out.println(empleado);
		 
	}

}
