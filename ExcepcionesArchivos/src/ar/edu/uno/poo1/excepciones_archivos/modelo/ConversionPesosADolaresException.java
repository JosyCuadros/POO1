package ar.edu.uno.poo1.excepciones_archivos.modelo;

public class ConversionPesosADolaresException extends ConversionMonedaException {

	private static final long serialVersionUID = 1L;
	
	public ConversionPesosADolaresException(String mensaje) {
		super(mensaje);
	}
	
	
	public ConversionPesosADolaresException() {
		this("Imposible convertir pesos argentinos a dolares estadounidenses");
	}

}
