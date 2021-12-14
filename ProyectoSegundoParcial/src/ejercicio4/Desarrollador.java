package ejercicio4;

public class Desarrollador implements Comparable <Desarrollador>{
	private int legajo;
	private String nombre;
	private Double sueldo;
	private Seniority seniority;
	
	
	public int getLegajo() {
		return legajo;
	}


	public String getNombre() {
		return nombre;
	}


	public Double getSueldo() {
		return sueldo;
	}


	public Seniority getSeniority() {
		return seniority;
	}


	public Desarrollador(int legajo, String nombre, Double sueldo, Seniority seniority) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.seniority = seniority;
	}


	@Override
	public int compareTo(Desarrollador otroDesarrollador) {
		return Double.compare(this.getSueldo(), otroDesarrollador.getSueldo());
	}


	@Override
	public String toString() {
		return "Desarrollador [legajo=" + legajo + ", nombre=" + nombre + ", sueldo=" + sueldo + ", seniority="
				+ seniority + "]";
	}
	
	
	

}
