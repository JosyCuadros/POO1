package ar.edu.poo1.geometria.domain;

public abstract class Figura implements Comparable<Figura>{
	
	public abstract double calcularArea(); 
	
	@Override
	public int compareTo(Figura otraFigura) {
		return Double.compare(this.calcularArea(), otraFigura.calcularArea());
	}


	
	
	

}
