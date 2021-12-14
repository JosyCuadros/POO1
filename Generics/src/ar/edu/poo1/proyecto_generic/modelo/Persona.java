package ar.edu.poo1.proyecto_generic.modelo;

public class Persona {
	
	private long dni;
	private int edad;
	
	
	public Persona(long dni, int edad) {
		super();
		this.dni = dni;
		this.edad = edad;
	}
	
	
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
