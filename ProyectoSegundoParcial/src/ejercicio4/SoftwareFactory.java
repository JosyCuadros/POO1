package ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class SoftwareFactory {
	
	private List<Desarrollador> desarrolladores;
	
	public SoftwareFactory() {
		this.desarrolladores = new ArrayList<Desarrollador>();
	}


	public void agregarDesarrollador(Desarrollador desarrollador) {
		desarrolladores.add(desarrollador);		
	}
	
	
	public List<Desarrollador> listarDesarrolladoresSegunSueldo(){
		List<Desarrollador> desarrolladoresOrdenados = new ArrayList<Desarrollador>();
		
		Object [] arreglo = desarrolladores.toArray();
		Arrays.sort(arreglo);
		
		for (Object objeto: arreglo) 
			desarrolladoresOrdenados.add((Desarrollador) objeto);
	
		return desarrolladoresOrdenados;	
	}
	
	
	public void seleccionarSemiSeniors(List<Desarrollador> ld) {
		Iterator<Desarrollador> iterador = ld.iterator();
		// it.hasNext() -> ¿hay próximo elemento?
		// it.next() -> retorna el próximo elemento
		// it.remove() -> elimina el elemento actual del iterador		
		
		while (iterador.hasNext()) {
			Desarrollador actual = iterador.next();
			
			if(actual.getSeniority() != Seniority.SEMISENIOR) {
				iterador.remove();
			}
		}	
	}
	
	
	public static void main(String[] args) {	
		SoftwareFactory softwareFactory = new SoftwareFactory();
		
		softwareFactory.agregarDesarrollador(new Desarrollador(1, "Pedro", 150000.00, Seniority.SEMISENIOR));
		softwareFactory.agregarDesarrollador(new Desarrollador(2, "Luis", 70000.00, Seniority.JUNIOR));
		softwareFactory.agregarDesarrollador(new Desarrollador(3, "Maria", 170000.00, Seniority.SEMISENIOR));
		softwareFactory.agregarDesarrollador(new Desarrollador(4, "Laura", 200000.00, Seniority.SENIOR));
		softwareFactory.agregarDesarrollador(new Desarrollador(5, "Pablo", 85000.00, Seniority.JUNIOR));
		softwareFactory.agregarDesarrollador(new Desarrollador(6, "Benjamin", 180000.00, Seniority.SEMISENIOR));
		softwareFactory.agregarDesarrollador(new Desarrollador(7, "Karen", 215000.00, Seniority.SENIOR));
		softwareFactory.agregarDesarrollador(new Desarrollador(8, "Sebastian", 195000.00, Seniority.SEMISENIOR));
		
		List<Desarrollador> desarrolladoresOrdenados = new ArrayList<Desarrollador>();
		
 		desarrolladoresOrdenados = softwareFactory.listarDesarrolladoresSegunSueldo();
		
		for (Desarrollador desarrollador: desarrolladoresOrdenados) {
			System.out.println(desarrollador);
		}
		
		softwareFactory.seleccionarSemiSeniors(desarrolladoresOrdenados);	
		
		System.out.println("-------");
		 
 		for (Desarrollador desarrollador: desarrolladoresOrdenados) {
 			System.out.println(desarrollador);
 		}
	}
	
	
	
	
	

}
