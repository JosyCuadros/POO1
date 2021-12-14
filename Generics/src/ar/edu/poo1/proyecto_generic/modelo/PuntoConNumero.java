package ar.edu.poo1.proyecto_generic.modelo;

public class PuntoConNumero <T extends Number>{
	private T x;
	private T y;
	
	public PuntoConNumero(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}
	
	
	
	
}
