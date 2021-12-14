package ar.edu.uno.poo1.proyecto_colecciones;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UsoQueue {
	public static void main(String[] args) {
		ConcurrentLinkedQueue<String> cola = new ConcurrentLinkedQueue<String>();
		System.out.println(cola.isEmpty()); //True
		// Offer -> para encolar/ Agregar elementos a la cola
		cola.offer("Obrigado");
		cola.offer("Thanks");
		cola.offer("Gracias");
		System.out.println(cola.isEmpty()); //false
		// poll -> para desencolar
		cola.poll();
		// peek -> para ver quien sigue en la cola
		System.out.println(cola.peek());  
		
		System.out.println("----------------------");
		ConcurrentLinkedQueue<String> colaAux = new ConcurrentLinkedQueue<String>();
		while (!cola.isEmpty()) {
			String dato = cola.poll();
			System.out.println(dato);
			colaAux.offer(dato);
		}
		while (!colaAux.isEmpty())
			cola.offer(colaAux.poll());
		   
	}

}
