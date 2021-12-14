package ar.edu.poo1.ejercicioCalificaciones.domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ejercicioCalificaciones {
	
	public static void main(String[] args) throws IOException {
		ArrayList<HashMap<String, String>> calificaciones = new ArrayList<HashMap<String, String>>();
		
		calificaciones = getCalificacionesAlumnos("archivos/Calificaciones.csv");
		
		System.out.println(calificaciones);
		
	}
	
	
	public static ArrayList<HashMap<String, String>> getCalificacionesAlumnos(String fichero) throws IOException{
		ArrayList<HashMap<String, String>> calificaciones = new ArrayList<HashMap<String, String>>();
		
		FileReader fr = new FileReader (fichero);
		BufferedReader br = new BufferedReader(fr);
	       
		String row;
		int indice = 0;
		
		while ((row = br.readLine()) != null){
			if (indice != 0) {
				HashMap<String, String> alumno = new HashMap<String, String>();
			
				String[] datos = row.split(";");
			
				alumno.put("Apellido", datos[0]);
				alumno.put("Nombre", datos[1]);
				alumno.put("Asistencia", datos[2]);
				alumno.put("Parcial 1", datos[3]);
				alumno.put("Parcial 2", datos[4]);
				alumno.put("Practica", datos[5]);
			
				calificaciones.add(alumno);
			}
			indice ++;
		}
		
		try{                    
	          if( br != null ){   
	             br.close();     
	          }                  
	       }catch (Exception e2){ 
	          e2.printStackTrace();
	       }
		
		return calificaciones;	
	}
	
	
	
	public void agregarNotaFinal(ArrayList<HashMap<String, String>> calificaciones){
		for (HashMap<String, String> alumno: calificaciones) {
			double notaFinal = calcularNotaFinal(Double.parseDouble(alumno.get("Parcial 1")), Double.parseDouble(alumno.get("Parcial 2")), Double.parseDouble(alumno.get("Practica")));
			
			alumno.put("NotaFinal", String.valueOf(notaFinal));	
		}
	}
	
	
	public double calcularNotaFinal(double parcial1, double parcial2, double practica) {
		return (parcial1 * 0.3) + (parcial2 * 0.3) + (practica * 0.4);
	}
	
	
}
