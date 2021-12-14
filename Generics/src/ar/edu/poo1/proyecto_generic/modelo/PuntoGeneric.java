package ar.edu.poo1.proyecto_generic.modelo;

public class PuntoGeneric <T, D>{
	private T x;
	private D y;
		
	public PuntoGeneric(T x, D y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public D getY() {
		return y;
	}

	public void setY(D y) {
		this.y = y;
	} 
	
	

}
