package ar.edu.poo1.geometria.domain;

public class Circulo extends Elipse {

	public Circulo(Punto centro, double radioMayor) {
			super(centro, radioMayor);					
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(getRadioMayor(), 2);		
	}	
}
