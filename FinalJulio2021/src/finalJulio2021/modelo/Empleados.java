package finalJulio2021.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empleados {
	private List<Empleado> empleados; 
	
	public Empleados() {
		this.empleados = new ArrayList<Empleado>();
	}
	
	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public void ordenarEmpleados() {
		Collections.sort(empleados);
		for (Empleado empleado: empleados)
			System.out.println(empleado);
	}
	
	 public List<Empleado> devolverRepetidos(){
		 List<Empleado> empleadosRepetidos = new ArrayList<Empleado>();
		 Empleado empleadoAnterior = null;
		 
		 for(Empleado empleado: empleados) {
			 if(empleado.equals(empleadoAnterior)) {
				 empleadosRepetidos.add(empleado);
			 }else {
				 empleadoAnterior = empleado;
			 }
		 }
		 
		 return empleadosRepetidos;
	 }

}
