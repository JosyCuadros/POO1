package ar.edu.uno.poo1.excepciones_archivos.modelo;

public class Moneda {
	private double valor;
	private TipoMoneda tipomoneda;
	
	public Moneda(double valor, TipoMoneda tipomoneda) {
		this.valor = valor;
		this.tipomoneda = tipomoneda;
	}

	public Moneda(double valor, String codmoneda) {
		this.valor = valor;
		this.tipomoneda = tipomoneda.valueOf(codmoneda);
		
	}
	
	public double getValor() {
		return valor;
	}

	public TipoMoneda getTipomoneda() {
		return tipomoneda;
	}
	
	
}
