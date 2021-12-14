package ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CuentaNumero {
	public Integer contarNumeros(String texto) {
		Integer cantidadNumeros = 0;
		String [] palabrasTexto;
		
		palabrasTexto = texto.split(" ");
		
		for (String palabra : palabrasTexto) {
			try {
				Double.parseDouble(palabra);
				cantidadNumeros = cantidadNumeros + 1; 
				System.out.println("Es numero");
			}catch(NumberFormatException e) {
				System.out.println("No Es numero");
			}	
		}
		
		return cantidadNumeros;
	}
	
	public String obtenerTextoDeArchivo(String archivoEntrada) {
		String texto = "";
		
		FileReader fr = null;
	    BufferedReader br = null;
	    
	    try{
			fr = new FileReader(archivoEntrada);
			br = new BufferedReader(fr);
			
			String linea;

			while ((linea=br.readLine()) !=null){
				texto = texto + " " + linea ; 
				
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
		
	    System.out.println(texto);
		return texto;		
	}
	
	public static void main(String[] args) {
		CuentaNumero c = new CuentaNumero();
		
		System.out.println(c.contarNumeros(c.obtenerTextoDeArchivo("archivos/texto.in")));
	}
}
