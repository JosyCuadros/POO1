package ar.edu.uno.poo1.excepciones_archivos.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

public class DemoExcepcionesV2 {

	public static void main(String[] args) throws Exception {
		
		LinkedList <Moneda> monedas = new LinkedList <Moneda>();  
				
		File file = new File("monedas.txt");
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		String linea = "";
		
		while ((linea = br.readLine()) != null) {
			String [] split = linea.split(";");
			Moneda moneda = new Moneda(Double.parseDouble(split[0]), split[1]);
//			System.out.println(linea);
			monedas.add(moneda);
		}
		br.close();
		
		HashMap<String, Double> mapaMonetario = new HashMap<String, Double>();
		
		for (Moneda mon: monedas) {
			String codigo = mon.getTipomoneda().getCodigo();
			double acumValor = mon.getValor();
			
			if (mapaMonetario.get(codigo) != null)
				acumValor =+ mapaMonetario.get(codigo);
			mapaMonetario.put(codigo, acumValor);
		}
		
		for (String clave : mapaMonetario.keySet())
			System.out.println(clave + " = " + mapaMonetario.get(clave));
	}

}
