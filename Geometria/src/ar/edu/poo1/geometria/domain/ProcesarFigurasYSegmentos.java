package ar.edu.poo1.geometria.domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;

import ar.edu.poo1.geometria.excepciones.InvalidCuadradoException;
import ar.edu.poo1.geometria.excepciones.InvalidRadioException;
import ar.edu.poo1.geometria.excepciones.InvalidSegmentoException;

public class ProcesarFigurasYSegmentos {
	private LinkedList<ObjetoLectura> figurasYSegmentos;
	private Map<String,PriorityQueue<Figura>> figurasOrdenadosPorArea;
	private PriorityQueue<Segmento> segOrdenadosPorLongitud;
	private PriorityQueue<Figura> figurasMasGrandes;
	
	public ProcesarFigurasYSegmentos(String nomArch)throws FileNotFoundException {
		setFigurasYSegmentos(nomArch);
		setSegmentosOrdenadosPorLongitud();
		setFigurasMasGrandesYFigurasOrdenadosPorArea();
	}
	
	
	public void setFigurasYSegmentos(String nomArch) throws FileNotFoundException{	
		figurasYSegmentos = new LinkedList<ObjetoLectura>();
		
	    FileReader fr = null;
	    BufferedReader br = null;

	    try {
	       fr = new FileReader (nomArch);
	       br = new BufferedReader(fr);
	       String linea;
	       
	       String [] columnas;

	       while((linea=br.readLine()) !=null) {
	    	   columnas = linea.split(",");
	    	   
	    	   try {
	    		   double columna1 = Double.parseDouble(columnas[1]);
	       		   double columna2 = Double.parseDouble(columnas[2]);
	       		 
	       		   switch (columnas.length) {
	       		   		case 4:{
	       		   			double columna3 = Double.parseDouble(columnas[3]);
	       			
	       		   			figurasYSegmentos.add(new ObjetoLectura(columnas[0],columna1,columna2, columna3));
	       		   			break;
	       		   				}
	       		   		case 5: {
	       		   			double columna3 = Double.parseDouble(columnas[3]);
	       		   			double columna4 = Double.parseDouble(columnas[4]);
						
	       		   			figurasYSegmentos.add(new ObjetoLectura(columnas[0],columna1,columna2, columna3, columna4));
	       		   			break;	
	       		   				}
	       		   		case 6: {
							double columna3 = Double.parseDouble(columnas[3]);
							double columna4 = Double.parseDouble(columnas[4]);
							double columna5 = Double.parseDouble(columnas[5]);
								
							figurasYSegmentos.add(new ObjetoLectura(columnas[0],columna1,columna2, columna3, columna4, columna5));
							break; 
	       		   				}
						case 7: {
							double columna3 = Double.parseDouble(columnas[3]);
							double columna4 = Double.parseDouble(columnas[4]);
							double columna5 = Double.parseDouble(columnas[5]);
							double columna6 = Double.parseDouble(columnas[6]);
									
							figurasYSegmentos.add(new ObjetoLectura(columnas[0],columna1,columna2, columna3, columna4, columna5, columna6));
							break;
								}
						default:
							throw new IllegalArgumentException("Unexpected value: " + columnas.length);							
							}							
					} catch (NumberFormatException e) {	
					  System.err.println("Dato invalido");
					  }	       
	       }
       }catch(IOException e2){
	       e2.printStackTrace();
	    }finally{
	       try{                    
	          if( fr != null ){   
	             fr.close();     
	          }                  
	       }catch (Exception e3){ 
	          e3.printStackTrace();
	       }
	    }
	}
	
	
	public void getParalelos() throws IOException {
		FileWriter archivo = new FileWriter("archivos/paralelos.out");
		PrintWriter paralelos = new PrintWriter(archivo);	
		
		for (ObjetoLectura objeto: figurasYSegmentos) {			
			if (objeto.getTipoObjeto().equals("SEGMENTO")) {
				Punto extremoA = new Punto(objeto.getColumna1(), objeto.getColumna2());
				Punto extremoB = new Punto(objeto.getColumna3(), objeto.getColumna4());
				
				try {
					Segmento segmento = new Segmento(extremoA, extremoB);
				
					if (segmento.paraleloEjeX() || segmento.paraleloEjeY()) {				
						paralelos.println(segmento); 	
					}
				}catch(InvalidSegmentoException e4) {
					System.err.println("Dato invalido");
					}		
			}else {
				if (objeto.getTipoObjeto().equals("TRIANGULO")) {				
					Punto vertice1 = new Punto(objeto.getColumna1(), objeto.getColumna2());
					Punto vertice2 = new Punto(objeto.getColumna3(), objeto.getColumna4());
					Punto vertice3 = new Punto(objeto.getColumna5(), objeto.getColumna6());
				     
					Triangulo triangulo = new Triangulo(vertice1, vertice2, vertice3);
					
					try {
						if ((triangulo.ladoParaleloEjeX(vertice1, vertice2) || triangulo.ladoParaleloEjeY(vertice1, vertice2)) ||
							(triangulo.ladoParaleloEjeX(vertice1, vertice3) || triangulo.ladoParaleloEjeY(vertice1, vertice3)) ||
							(triangulo.ladoParaleloEjeX(vertice2, vertice3) || triangulo.ladoParaleloEjeY(vertice2, vertice3))) {	
						
							 paralelos.println("Triangulo: " + triangulo); }
						}catch (InvalidSegmentoException e5) {
							System.err.println("Dato invalido");
							}
					}	
				}
				
			}	
		
		paralelos.close();	
	}
	
	
	public void setSegmentosOrdenadosPorLongitud() {
		segOrdenadosPorLongitud = new PriorityQueue<Segmento>(Collections.reverseOrder());
		
		for (ObjetoLectura objeto: figurasYSegmentos) {			
			if (objeto.getTipoObjeto().equals("SEGMENTO")) {
				Punto extremoA = new Punto(objeto.getColumna1(), objeto.getColumna2());
				Punto extremoB = new Punto(objeto.getColumna3(), objeto.getColumna4());
				
				try {
					Segmento segmento = new Segmento(extremoA, extremoB);
					segOrdenadosPorLongitud.add(segmento);

				}catch(InvalidSegmentoException e6) {
					System.err.println("Dato invalido");
					}					
			}
		}
	}
	
	
	public void setFigurasMasGrandesYFigurasOrdenadosPorArea() {
		figurasOrdenadosPorArea = new HashMap<String, PriorityQueue<Figura>>();
		figurasMasGrandes = new PriorityQueue<Figura>(Collections.reverseOrder());
		
		for (ObjetoLectura objeto: figurasYSegmentos) {	
			String key = objeto.getTipoObjeto();
			
			if (objeto.getTipoObjeto().equals("ELIPSE")) {
				try {
					Elipse elipse = new Elipse(new Punto(objeto.getColumna3(), objeto.getColumna4()), objeto.getColumna1(), objeto.getColumna2());					
					figurasMasGrandes.add(elipse);
					
					if (figurasOrdenadosPorArea.containsKey(key)) {
						figurasOrdenadosPorArea.get(key).offer(elipse);
					}else {
						PriorityQueue<Figura> colaF = new PriorityQueue<Figura>(Collections.reverseOrder());
						colaF.offer(elipse);
						figurasOrdenadosPorArea.put(key, colaF);
					}					
				}catch(InvalidRadioException e7) {
					System.err.println("Dato invalido");
					}					
			}
			
			
			if (objeto.getTipoObjeto().equals("CIRCULO")) {			
				try {
					Circulo circulo = new Circulo(new Punto(objeto.getColumna2(), objeto.getColumna3()), objeto.getColumna1());									
					figurasMasGrandes.add(circulo);
					
					if (figurasOrdenadosPorArea.containsKey(key)) {
						figurasOrdenadosPorArea.get(key).offer(circulo);
					}else {
						PriorityQueue<Figura> colaF = new PriorityQueue<Figura>(Collections.reverseOrder());
						colaF.offer(circulo);
						figurasOrdenadosPorArea.put(key, colaF);
					}
				}catch(InvalidRadioException e8) {
					System.err.println("Dato invalido");
					}					
			}
			
			
			if (objeto.getTipoObjeto().equals("RECTANGULO")) {			
				Rectangulo rectangulo = new Rectangulo(new Punto(objeto.getColumna1(), objeto.getColumna2()), new Punto(objeto.getColumna3(),objeto.getColumna4()));					
				figurasMasGrandes.add(rectangulo);
				
				if (figurasOrdenadosPorArea.containsKey(key)) {
					figurasOrdenadosPorArea.get(key).offer(rectangulo);
				}else {
					PriorityQueue<Figura> colaF = new PriorityQueue<Figura>(Collections.reverseOrder());
					colaF.offer(rectangulo);
					figurasOrdenadosPorArea.put(key, colaF);
				}					
			}
			
			
			if (objeto.getTipoObjeto().equals("CUADRADO")) {	
				try {
					Cuadrado cuadrado = new Cuadrado(new Punto(objeto.getColumna2(),objeto.getColumna3()), objeto.getColumna1());					
					figurasMasGrandes.add(cuadrado);
					
					if (figurasOrdenadosPorArea.containsKey(key)) {
						figurasOrdenadosPorArea.get(key).offer(cuadrado);
					}else {
						PriorityQueue<Figura> colaF = new PriorityQueue<Figura>(Collections.reverseOrder());
						colaF.offer(cuadrado);
						figurasOrdenadosPorArea.put(key, colaF);
					}
				}catch(InvalidCuadradoException e9) {
					System.err.println("Dato invalido");
					}	
			}
			
			
			if (objeto.getTipoObjeto().equals("TRIANGULO")) {	
				try {
					Triangulo triangulo = new Triangulo(new Punto(objeto.getColumna1(),objeto.getColumna2()),new Punto(objeto.getColumna3(),objeto.getColumna4()), new Punto(objeto.getColumna5(),objeto.getColumna6()));					
					figurasMasGrandes.add(triangulo);
					
					if (figurasOrdenadosPorArea.containsKey(key)) {
						figurasOrdenadosPorArea.get(key).offer(triangulo);
					}else {
						PriorityQueue<Figura> colaF = new PriorityQueue<Figura>(Collections.reverseOrder());
						colaF.offer(triangulo);
						figurasOrdenadosPorArea.put(key, colaF);
					}
				}catch(InvalidCuadradoException e9) {
					System.err.println("Dato invalido");
					}	
			}				
		}
	}
	
	
	public void getGrandotes() throws IOException {
		FileWriter archivo = new FileWriter("archivos/grandotes.out");
		PrintWriter grandotes = new PrintWriter(archivo);
		double longitudPrev = 0;
		double areaPrev = 0;
		
		while (!segOrdenadosPorLongitud.isEmpty() && !(longitudPrev == -1)) {
			Segmento dato = segOrdenadosPorLongitud.poll();
			double longitud = dato.calcularLongitud();
			
			if (longitudPrev == 0) { 
				grandotes.println(dato + " Longitud: " + longitud);				
				longitudPrev = longitud;
			}else {
				if (longitud == longitudPrev) {
					grandotes.println(dato + " Longitud" + longitud);
					longitudPrev = longitud;
				}else {
						longitudPrev = -1;
					}
			}				
		}
	
		while (!figurasMasGrandes.isEmpty() && !(areaPrev == -1)) {
			Figura dato = figurasMasGrandes.poll();
			double area = dato.calcularArea();
			
			if (areaPrev == 0) { 
				grandotes.println(dato + " Area: " + area);				
				areaPrev = area;
			}else {
				if (area == areaPrev) {
					grandotes.println(dato + " Area: " + area);
					areaPrev = area;
				}else {
					areaPrev = -1;
					}
			}				
		}
		grandotes.close();	
	}
	

	public void getfiguras() throws IOException {
		FileWriter archivo = new FileWriter("archivos/figuras.out");
		PrintWriter figuras = new PrintWriter(archivo);
		
		for (Map.Entry<String, PriorityQueue<Figura>> entry : this.figurasOrdenadosPorArea.entrySet()) {
			
			figuras.println(entry.getKey());
			
			while (!entry.getValue().isEmpty()){
				Figura dato = entry.getValue().poll();
				double area = dato.calcularArea();
						
				figuras.println(dato + " Area: " + area);
			}						
		}		
		figuras.close();
	}
	
}

