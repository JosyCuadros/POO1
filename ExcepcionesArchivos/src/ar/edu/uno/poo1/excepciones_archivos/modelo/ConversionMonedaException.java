package ar.edu.uno.poo1.excepciones_archivos.modelo;

public class ConversionMonedaException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ConversionMonedaException(String mensaje) {
		super(mensaje);
		
	}
	
	public ConversionMonedaException() {
		this("Conversion incorrecta entre monedas");
	}
	
	

}
