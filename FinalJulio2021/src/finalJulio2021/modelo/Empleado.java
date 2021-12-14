package finalJulio2021.modelo;

import java.util.Objects;

public class Empleado implements Comparable<Empleado>{
	
	private String nombre;
	private int dni;
	
	public Empleado(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDni() {
		return dni;
	}

	@Override
	public int compareTo(Empleado otroEmpleado) {	
		return Integer.compare(this.getDni(), otroEmpleado.getDni());
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return dni == other.dni && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni + "]";
	}
}
