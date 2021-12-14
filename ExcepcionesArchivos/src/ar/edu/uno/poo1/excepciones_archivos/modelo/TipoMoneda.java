package ar.edu.uno.poo1.excepciones_archivos.modelo;

public enum TipoMoneda {
	
	REALES("RS", "Reales"),
	PESOS_ARGENTINOS("ARS", "Pesos Argentinos"),
	GUARANIES("GS", "Guaranies"),
	DOLARES_ESTADOUNIDENSES("USD", "Dolares Estadounidenses");
	
	private String codigo;
	private String nombre;
	
	private TipoMoneda(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String toString() {
		return codigo + "-" + nombre; 
	}

}
