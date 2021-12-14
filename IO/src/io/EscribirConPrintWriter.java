package io;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// esto es un ejemplo minimo para  grabar sus datos en un archivo  de texto
public class EscribirConPrintWriter {

	public static void main(String[] args)	throws IOException {
		//  preparo el arch de salida
		FileWriter archivo = new FileWriter("archivos/salida.out");
		PrintWriter salida = new PrintWriter(archivo);  
		int cantidad = 10;
		  
	    for(int i=0; i<cantidad; i++) {
	    	salida.print(i);
	    	salida.print("   ");
	    	
	    	if (i < cantidad - 1)
	    		salida.println(i * 10);
	    	else
	    		salida.print(i * 10);
	    }	
				
		salida.close(); //esto escribe : dni: 50

	}

}
