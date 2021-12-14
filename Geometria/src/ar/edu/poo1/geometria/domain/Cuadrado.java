package ar.edu.poo1.geometria.domain;

import ar.edu.poo1.geometria.excepciones.InvalidCuadradoException;

public class Cuadrado extends Rectangulo {
	private double lado;

	public Cuadrado(Punto puntoInfIzq, double lado) {
		super(puntoInfIzq);
		
		if (lado <= 0) {
			throw new InvalidCuadradoException("Imposible crear un cuadrado con un lado igual a cero o negativo");
		}else {
		this.lado = lado;}
	}

	public double getLado() {
		return lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(lado, 2);		
	}

	@Override
	public String toString() {
		return "Lado= " + lado + " " + super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuadrado other = (Cuadrado) obj;
		return Double.doubleToLongBits(lado) == Double.doubleToLongBits(other.lado);
	}
	
	
	
}
