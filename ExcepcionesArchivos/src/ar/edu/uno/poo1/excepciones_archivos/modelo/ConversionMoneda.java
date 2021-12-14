package ar.edu.uno.poo1.excepciones_archivos.modelo;

import java.util.Calendar;

public class ConversionMoneda {
	private Moneda origen;
	private Moneda destino;
	
	public ConversionMoneda(Moneda origen, Moneda destino) {
		this.origen = origen;
		this.destino = destino;
	}
	
	public boolean convertir() throws ConversionMonedaException {
		
		if (origen.getValor() == 0 || destino.getValor() == 0)
			throw new ConversionMonedaException("Los valores entre monedas no se puede realizar");
		
		if ((origen.getTipomoneda().getCodigo().equals(TipoMoneda.PESOS_ARGENTINOS.getCodigo())) && 
		    (destino.getTipomoneda().getCodigo().equals(TipoMoneda.DOLARES_ESTADOUNIDENSES.getCodigo()))) {
			
			Calendar calendar = Calendar.getInstance();
			int dia_Semana = calendar.get(Calendar.DAY_OF_WEEK);
			
			if ((dia_Semana ==1) || (dia_Semana == 7))
				throw new ConversionPesosADolaresException();

		}	
		return true;
	}

}
