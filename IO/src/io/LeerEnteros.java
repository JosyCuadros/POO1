package io;
import java.io.*;

public class LeerEnteros {
	public static void main(String [] arg) {
		int suma=0, contador = 0;
		File f = null;
		FileReader fr = null;
		BufferedReader br =null;
		try
		{
			f = new File("archivos/enteros.in");
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String linea;
			
			while((linea=br.readLine())!=null) {
				try {
					suma += Integer.parseInt(linea);
					contador ++;
				} 
				catch (NumberFormatException e) {
					System.err.println("Uno de los datos leidos (" + linea + ") no es un entero");
				}
			
			}

			System.out.println("Suma: " + suma);
			System.out.println("Promedio: " + (double) suma/contador);

		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Suma Finally: " + suma);
			try{                    
	            if( fr != null ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
		}
	}
}