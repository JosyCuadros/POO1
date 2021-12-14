package ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class Diccionario {
	
	public String traducir(String texto, Map<String, String> diccionario) {
		String [] palabrasTexto;
		String [] cadenaTraducida; 
		String cadena = null; 
		
		palabrasTexto = texto.split(" ");
		cadenaTraducida = new String [palabrasTexto.length]; 
		
		for (int i=0; i<palabrasTexto.length; i++) {
			String palabra = palabrasTexto[i];
			System.out.print (palabra + " ");
// 			no hay necesidad de recorrer el mapa, con tan solo el contains recorre el mapa. 
//			for (Map.Entry<String, String> entry : diccionario.entrySet()) {
				if (diccionario.containsKey(palabra)) {
					
			 		cadenaTraducida[i] = diccionario.get(palabra);
			 		
				}else {
					cadenaTraducida[i] = ("<error>");					
				}	
//			}
		}	
		
	    for (int i=0; i<cadenaTraducida.length; i++) {
	    	if (i == 0)
	    		cadena = cadenaTraducida[i];
	    	else
	    		cadena = cadena + " " + cadenaTraducida[i]; 
	    }
		 
		return cadena;	
	}	

	
	public Map<String, String> obtenerDiccionario() {
		//modificarlo si fuera necesario para hacer más y mejores pruebas
		Map<String, String> diccionario = new HashMap<String, String>();
		diccionario.put("amistad", "friendship");
		diccionario.put("La", "the");
		diccionario.put("el", "the");
		diccionario.put("uno", "one");
		diccionario.put("vida", "life");
		diccionario.put("buenos", "good");
		diccionario.put("importantes", "important");
		diccionario.put("más", "most");
		diccionario.put("tener", "to have");
		diccionario.put("pueden", "can");
		diccionario.put("difíciles", "difficult");
		diccionario.put("es", "is");

		return diccionario;
	}
	
	public static void main(String[] args) {
		Diccionario dicc = new Diccionario();
		//modificarlo si fuera necesario para hacer más y mejores pruebas
		String texto = "La amistad es uno de los valores más importantes "
				+ "que se pueden tener en la vida";
		
		String textoTraducido = dicc.traducir(texto, dicc.obtenerDiccionario());
		System.out.println (" "); 
		System.out.print(textoTraducido);
	}

}
