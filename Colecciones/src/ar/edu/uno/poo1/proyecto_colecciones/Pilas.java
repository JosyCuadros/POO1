package ar.edu.uno.poo1.proyecto_colecciones;

import java.util.LinkedList;

public class Pilas {
	
	private LinkedList<String> elementos;
	
	public Pilas() {
		elementos = new LinkedList<String>();
	}
	
	public void poner(String elemento) {
		elementos.addFirst(elemento);
	}
	
	public void sacar() {
		elementos.removeFirst();
	}
	
	public String ver(){
		return elementos.get(0);
	}
	
	

}
