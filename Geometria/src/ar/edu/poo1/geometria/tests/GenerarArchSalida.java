package ar.edu.poo1.geometria.tests;

import java.io.IOException;
import ar.edu.poo1.geometria.domain.ProcesarFigurasYSegmentos;

public class GenerarArchSalida {
	
	public static void main (String [] arg) throws IOException {		
				
		ProcesarFigurasYSegmentos procesarFigurasYSegmentos = new ProcesarFigurasYSegmentos("archivos/input.csv");	
		procesarFigurasYSegmentos.getParalelos();
		procesarFigurasYSegmentos.getGrandotes();
		procesarFigurasYSegmentos.getfiguras();	
	}
}
