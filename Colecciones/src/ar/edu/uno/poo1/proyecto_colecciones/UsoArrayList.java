package ar.edu.uno.poo1.proyecto_colecciones;

import java.util.ArrayList;

public class UsoArrayList {
	
	public static void main(String[] args) {
// Al instanciar el array con el constructor vacio, la capacidad del array es 10.
// Si nos excedemos el tamaño del array, se duplica la capacidad del tamaño.  		
		
		ArrayList<String> vector = new ArrayList<String>();
		System.out.println(vector.size());
		vector.add("Medialuna");
		System.out.println(vector.size());
		vector.add("cafe cortado");
		System.out.println(vector.size());
		vector.remove(0);
		System.out.println(vector.size());
		vector.remove("cafe cortado");
		System.out.println(vector.size());
	//	vector.remove(3);
		
		ArrayList<Boolean> vector2 = new ArrayList<Boolean>(30);
        vector2.add(Boolean.TRUE);
        
        ArrayList<ArrayList<Character>> vectorArrayListChar = new ArrayList<ArrayList<Character>>();
        ArrayList<Character> vectorChar1 = new ArrayList<Character>();
        vectorChar1.add('a');
        vectorChar1.add('b');
        vectorChar1.add('c');
        
        ArrayList<Character> vectorChar2 = new ArrayList<Character>();
        vectorChar2.add('d');
        vectorChar2.add('e');
        vectorChar2.add('f');
        
        vectorArrayListChar.add(vectorChar1);
        vectorArrayListChar.add(vectorChar2);
        System.out.println(vectorArrayListChar.size());
        System.out.println(vectorChar1.size());
        System.out.println(vectorChar2.size());
        System.out.println(vectorArrayListChar.get(1).get(2));
		
        for (ArrayList<Character> a: vectorArrayListChar) { 	
        	for (Character b : a)
        		System.out.print(b + " " );
            System.out.println();
        }   
        
//        vector.i
	}
}
