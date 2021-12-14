package ar.edu.poo1.geometria.domain;


public class Punto implements Desplazable{
	private double x;
	private double y;
	
    public Punto(double x, double y) {
    	this.x = x;
    	this.y = y;   	
    }
      
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public double calcularLongitud(Punto punto) {
		double cateto1 = this.getX() - punto.getX();
		double cateto2 = this.getY() - punto.getY();
		return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	}
	
	@Override
	public void desplazar(double x, double y) {
		this.x += x;
		this.y += y;	
	}

	@Override
	public String toString() {
		return " (x=" + x + ", y=" + y + ") " ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}
	
	
	
}
