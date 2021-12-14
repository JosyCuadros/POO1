package ar.edu.poo1.geometria.domain;

public class ObjetoLectura {
	private String tipoObjeto;
	private double columna1;
	private double columna2;
	private double columna3;
	private double columna4;
	private double columna5;
	private double columna6;
	
	public ObjetoLectura(String tipoObjeto, double columna1, double columna2, double columna3, double columna4,
			double columna5, double columna6) {
		this(tipoObjeto, columna1, columna2, columna3, columna4, columna5);
		this.columna6 = columna6;
	}
	
	public ObjetoLectura(String tipoObjeto, double columna1, double columna2, double columna3, double columna4,
			double columna5) {
		this(tipoObjeto, columna1, columna2, columna3, columna4);
		this.columna5 = columna5;
	}
	
	public ObjetoLectura(String tipoObjeto, double columna1, double columna2, double columna3, double columna4) {
		this(tipoObjeto, columna1, columna2, columna3);
		this.columna4 = columna4;
	}
	
	public ObjetoLectura(String tipoObjeto, double columna1, double columna2, double columna3) {
		this.tipoObjeto = tipoObjeto;
		this.columna1 = columna1;
		this.columna2 = columna2;
		this.columna3 = columna3;
	}

	public String getTipoObjeto() {
		return tipoObjeto;
	}

	public double getColumna1() {
		return columna1;
	}

	public double getColumna2() {
		return columna2;
	}

	public double getColumna3() {
		return columna3;
	}

	public double getColumna4() {
		return columna4;
	}

	public double getColumna5() {
		return columna5;
	}

	public double getColumna6() {
		return columna6;
	}
	

	@Override
	public String toString() {
		return tipoObjeto + "," + columna1 + "," + columna2
				+ "," + columna3 + "," + columna4 + "," + columna5 + ","
				+ columna6;
	}
	
}
