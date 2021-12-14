package ar.edu.uno.poo1.proyecto_colecciones;

import java.util.Stack;

public class UsoStack {
	public static void main(String[] args) {
		Stack<String> pila = new Stack <String>();
		System.out.println(pila.isEmpty()); // True
		pila.push("Obrigado"); 
		pila.push("Thanks");
		pila.push("Gracias");
		System.out.println(pila.peek());
		pila.pop();
		System.out.println(pila.peek());
		
		System.out.println("----------------------");
		Stack<String> pilaux = new Stack<String>();
		while (!pila.isEmpty()) {
			String dato = pila.pop();
			System.out.println(dato);
			pilaux.push(dato);
		}
		while (!pilaux.isEmpty())
			pila.push(pilaux.pop());
		
	}

}
