package ar.edu.poo1.geometria.domain;

import java.util.Objects;

public class Rectangulo extends Figura{
	private Punto puntoInfIzq;
	private Punto puntoSupDer;
	
	public Rectangulo(Punto puntoInfIzq, Punto puntoSupDer) {
		this.puntoInfIzq = puntoInfIzq;
		this.puntoSupDer = puntoSupDer;
	}
	
	public Rectangulo(Punto puntoInfIzq) {
		this.puntoInfIzq = puntoInfIzq;
	}

	public void desplazarPuntoInfIzq(double x, double y) {
		this.puntoInfIzq.desplazar(x, y);
	}
	
	public void desplazarPuntoSupDer(double x, double y) {
		this.puntoSupDer.desplazar(x, y);
	}

	
	@Override
	public double calcularArea() {
		Punto puntoInfDer = new Punto(this.puntoSupDer.getX() ,this.puntoInfIzq.getY());
		Punto puntoSupIzq = new Punto(this.puntoInfIzq.getX(), this.puntoSupDer.getY());
		double base = this.puntoInfIzq.calcularLongitud(puntoInfDer);
		double altura = this.puntoInfIzq.calcularLongitud(puntoSupIzq);
		
		return base*altura;
	}
	
	
	
	
	@Override
	public String toString() {
		return "PuntoInfIzq=" + puntoInfIzq + ", PuntoSupDer=" + puntoSupDer;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangulo other = (Rectangulo) obj;
		return Objects.equals(puntoInfIzq, other.puntoInfIzq) && Objects.equals(puntoSupDer, other.puntoSupDer);
	}

	
}
