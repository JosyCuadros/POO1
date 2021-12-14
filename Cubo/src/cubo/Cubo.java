package cubo;

public class Cubo {

	private int lado; 
	
	public Cubo(int lado) {
		this.lado = lado;
	}
	
	public int medirLongitudLado() {
		return this.lado; 	
	}
	
	public void cambiarLongitudLado(int lado) {
		this.lado = lado; 
	}
	
	public int medirSuperficieCara() {
		return this.lado * this.lado;	
	}
	
	
	public void cambiarSuperficieCara(int superficieCara) {
		this.lado = (int) Math.sqrt(superficieCara); 	
	}
	
	public double medirVolumen() {
		return this.lado * this.medirSuperficieCara();	
	}
	
	public void cambiarVolumen(double volumen) {
		 this.lado = (int) Math.cbrt(volumen);	
	}
	
	
	
}
