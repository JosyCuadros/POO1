package ar.edu.poo1.geometria.domain;

import java.util.Objects;

public class Triangulo extends Figura{
	private Punto vertice1;
	private Punto vertice2;
	private Punto vertice3;
	
	
	public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.vertice3 = vertice3;
	}

	public void desplazarVertice1(double x, double y) {
		this.vertice1.desplazar(x, y);
	}
	
	public void desplazarVertice2(double x, double y) {
		this.vertice2.desplazar(x, y);
	}
	
	public void desplazarVertice3(double x, double y) {
		this.vertice3.desplazar(x, y);
	}

	public boolean ladoParaleloEjeX(Punto verticeA, Punto verticeB) {
		Segmento lado  = new Segmento(verticeA, verticeB);
		return lado.paraleloEjeX();
	}
	
	public boolean ladoParaleloEjeY(Punto verticeA, Punto verticeB) {
		Segmento lado  = new Segmento(verticeA, verticeB);
		return lado.paraleloEjeY();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangulo other = (Triangulo) obj;
		return Objects.equals(vertice1, other.vertice1) && Objects.equals(vertice2, other.vertice2)
				&& Objects.equals(vertice3, other.vertice3);
	}

	@Override
	public String toString() {
		return "Vertice1= " + vertice1 + ", Vertice2= " + vertice2 + ", Vertice3= " + vertice3;
	}

	@Override
	public double calcularArea() {
		double lado1 = vertice1.calcularLongitud(vertice2);
		double lado2 = vertice1.calcularLongitud(vertice3);
		double lado3 = vertice2.calcularLongitud(vertice3);
		double semiPerimetro = (lado1 + lado2 + lado3)/2;		
		double area = Math.sqrt(semiPerimetro*(semiPerimetro - lado1)*(semiPerimetro - lado2)*(semiPerimetro - lado3));
		
		return area;
	}
		
}
