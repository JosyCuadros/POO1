package ar.edu.uno.poo1.proyecto_colecciones;

import java.util.LinkedList;

public class UsoLinkedList {
	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList <String>();
		System.out.println(lista.isEmpty()); // true
		lista.add("Obrigado");
		lista.add("Thanks");
		lista.add("Gracias");
		
		
		System.out.println(lista.isEmpty()); // false
		
		lista.remove("Thanks");
		
		for (String str : lista)
			System.out.println(str);
		System.out.println(lista.size());
			
	} 

}
