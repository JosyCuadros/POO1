package ar.edu.uno.poo1.excepciones_archivos.modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraArchivo {

	public static void main(String[] args) throws IOException {
		File file = new File("datos.txt");
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Boa noite alunos, tudo bem?. Alguem tem alguma duvida");
		bw.newLine();
		bw.write("Por favor, voces tem que devenvolver programas");
		bw.close();
	}

}
