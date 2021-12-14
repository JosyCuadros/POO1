package ar.edu.uno.poo1.excepciones_archivos.modelo;

public class DemoExcepciones {
	public static void main(String[] args) {
// 		Devuelve error (NumberFormatException)
//		Integer.parseInt("1234h");

//      		
//		int enteros[] = new int[] {2,3,4,5};
//		System.out.println(enteros[9]);
		
		
	    Moneda mon1 = new Moneda(100, TipoMoneda.PESOS_ARGENTINOS);
	    Moneda mon2 = new Moneda(1000, TipoMoneda.DOLARES_ESTADOUNIDENSES);
	    
	    ConversionMoneda conv = new ConversionMoneda(mon1, mon2);
	    
	    try {
			conv.convertir();
	    } catch (ConversionPesosADolaresException e1) {
			e1.printStackTrace();	
		} catch (ConversionMonedaException e) {
			e.printStackTrace();
		}
	}
}
