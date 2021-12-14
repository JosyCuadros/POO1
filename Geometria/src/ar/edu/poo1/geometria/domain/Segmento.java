package ar.edu.poo1.geometria.domain;


import java.util.Objects;

import ar.edu.poo1.geometria.excepciones.InvalidSegmentoException;

public class Segmento implements Comparable<Segmento>{
	private Punto extremoA;
	private Punto extremoB;
	
	
	public Segmento(Punto extremoA, Punto extremoB) {
		if (extremoA.equals(extremoB)) {
			throw new InvalidSegmentoException("Imposible crear un segmento con puntos iguales");
		}
		else {
			this.extremoA = extremoA;
			this.extremoB = extremoB;}
	}
	
	
	public Punto getExtremoA() {
		return extremoA;
	}


	public Punto getExtremoB() {
		return extremoB;
	}


	public boolean paraleloEjeX() {
		return this.extremoA.getY() == this.extremoB.getY();
	}
	
	public boolean paraleloEjeY() {
		return this.extremoA.getX() == this.extremoB.getX();
	}
	
	
	public boolean sonParalelosEntreSi(Segmento otroSegmento) {
		double pendiente = (extremoB.getY() - extremoA.getY()) / (extremoB.getX() - extremoA.getX());
		double pendienteOtroSegmento = (otroSegmento.extremoB.getY() - otroSegmento.extremoA.getY()) / (otroSegmento.extremoB.getX() - otroSegmento.extremoA.getX());

		if (pendiente == pendienteOtroSegmento)
			return true; 
		return false;
	}
	
	public double calcularLongitud() {
		return this.extremoA.calcularLongitud(this.extremoB);
	}
	
	public void desplazarExtremoA(double x, double y) {
		this.extremoA.desplazar(x, y);
	}
	
	public void desplazarExtremoB(double x, double y) {
		this.extremoB.desplazar(x, y);
	}

	@Override
	public int compareTo(Segmento otroSegmento) {
		return Double.compare(this.calcularLongitud(), otroSegmento.calcularLongitud());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Segmento other = (Segmento) obj;
		return Objects.equals(extremoA, other.extremoA) && Objects.equals(extremoB, other.extremoB);
	}

	@Override
	public String toString() {
		return "Segmento [ExtremoA=" + extremoA + ", ExtremoB=" + extremoB + "]";
	}
	
	



	
	



	

	



	
	



}
