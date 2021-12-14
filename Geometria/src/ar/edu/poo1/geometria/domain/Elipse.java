package ar.edu.poo1.geometria.domain;

import java.util.Objects;

import ar.edu.poo1.geometria.excepciones.InvalidRadioException;

public class Elipse extends Figura{
	private Punto centro;
	private double radioMayor;
	private double radioMenor;
	

	public Elipse(Punto centro, double radioMayor, double radioMenor) {
		this.centro = centro;
		if ((radioMayor == radioMenor) &&  (radioMayor <= 0)) {
			throw new InvalidRadioException("Imposible crear un circulo con un radio menor o igual a cero");	
 		}else {
			this.radioMayor = radioMayor;
			this.radioMenor = radioMenor;
			}	
	}

	public Elipse(Punto centro, double radioMayor) {
		this.centro = centro;
		if ((radioMayor == radioMenor) &&  (radioMayor <= 0)) {
			throw new InvalidRadioException("Imposible crear un circulo con un radio menor o igual a cero");	
		}else {
			this.radioMayor = radioMayor;
			this.radioMenor = radioMayor;
		}
	}

	public Punto getCentro() {
		return centro;
	}

	public double getRadioMayor() {
		return radioMayor;
	}

	public double getRadioMenor() {
		return radioMenor;
	}

	public void desplazarCentro(double x, double y) {
		this.centro.desplazar(x, y);			
	}
	
	@Override
	public double calcularArea() {	
		return Math.PI * this.getRadioMayor() * this.getRadioMenor();
	}

	@Override
	public String toString() {
		return "Centro= " + centro + ", RadioMayor= " + radioMayor + ", RadioMenor= " + radioMenor;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Elipse other = (Elipse) obj;
		return Objects.equals(centro, other.centro)
				&& Double.doubleToLongBits(radioMayor) == Double.doubleToLongBits(other.radioMayor)
				&& Double.doubleToLongBits(radioMenor) == Double.doubleToLongBits(other.radioMenor);
	}
	
	
	
	

	
	
	
}
