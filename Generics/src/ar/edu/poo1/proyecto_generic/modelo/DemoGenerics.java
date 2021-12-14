package ar.edu.poo1.proyecto_generic.modelo;

public class DemoGenerics {
	
	public static void main(String[] args) {
		
		PuntoGeneric<Integer, String> pg = new PuntoGeneric<Integer, String>(9, "Noviembre");
		
		System.out.println(pg.getY());
		
		PuntoGeneric<Double, Double> pg2 = new PuntoGeneric<Double, Double>(3.14, 9.5);
		System.out.println(pg2.getX());
		
		PuntoConNumero<Integer> pcn= new PuntoConNumero<Integer>(1,5);
		
	}
	

}
