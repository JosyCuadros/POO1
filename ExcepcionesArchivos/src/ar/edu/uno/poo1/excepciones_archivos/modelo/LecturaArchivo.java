package ar.edu.uno.poo1.excepciones_archivos.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("datos.txt");
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		String linea = "";
		
		while ((linea = br.readLine()) != null) {
			System.out.println(linea);
		}
		br.close();
	}
	
	

}
