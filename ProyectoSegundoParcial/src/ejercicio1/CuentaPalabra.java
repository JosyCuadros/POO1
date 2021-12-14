package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


public class CuentaPalabra {
	
	public void cuentaPalabras(String archivoEntrada, String archivoSalida, String[] palabras) throws IOException {
		FileReader fr = null;
	    BufferedReader br = null;
		HashMap<String, Integer> contadorPalabras = new HashMap<String, Integer>();
		int contador=0;
	
		try{
			fr = new FileReader(archivoEntrada);
			br = new BufferedReader(fr);
			
			String linea;

			while ((linea=br.readLine()) !=null){
				String [] datos; 
				
				datos = linea.split(" ");
				
				for (String palabra : palabras) {	
					for (String dato: datos) {
						if (palabra.equals(dato)) {
							if (contadorPalabras.containsKey(palabra)){
								 contador = contadorPalabras.get(palabra) + 1;
							 	contadorPalabras.put(palabra, contador);
							}else {
								contadorPalabras.put(palabra, 1);
							}
						}
							
					}
				}								
			}

		} catch (IOException e){
			e.printStackTrace();
		}finally{
			try{                    
				if( fr != null ){   
					fr.close();     
			    	}                  
			   }catch (Exception e1){ 
			          e1.printStackTrace();
			   }
		}
		
		FileWriter  archivo= new FileWriter(new File(archivoSalida));
		PrintWriter salida = new PrintWriter(archivo);
		
		for (Map.Entry<String, Integer> entry : contadorPalabras.entrySet())
			salida.println( entry.getKey() + " aparece : " + entry.getValue() + " veces");
				
		salida.close();
	
	}
		

	public String[] obtenerArregloDePalabras() {
		//modificarlo si fuera necesario para hacer más y mejores pruebas
		String[] s = {"Vim", "unix", "editor", "modo", "órdenes", "versión", "la"};
//		String[] s = {"Vim", "unix"};
		return s;
	}
	
	
	public static void main(String[] args) throws IOException {
		CuentaPalabra contador = new CuentaPalabra();
		contador.cuentaPalabras("archivos/archivoDeEntrada.in", "archivos/archivoDeSalida.out", contador.obtenerArregloDePalabras());
	}

}
