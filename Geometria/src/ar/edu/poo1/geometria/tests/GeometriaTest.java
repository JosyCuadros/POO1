package ar.edu.poo1.geometria.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import ar.edu.poo1.geometria.domain.Circulo;
import ar.edu.poo1.geometria.domain.Cuadrado;
import ar.edu.poo1.geometria.domain.Elipse;
import ar.edu.poo1.geometria.domain.Punto;
import ar.edu.poo1.geometria.domain.Rectangulo;
import ar.edu.poo1.geometria.domain.Segmento;
import ar.edu.poo1.geometria.domain.Triangulo;
import ar.edu.poo1.geometria.excepciones.InvalidCuadradoException;
import ar.edu.poo1.geometria.excepciones.InvalidRadioException;
import ar.edu.poo1.geometria.excepciones.InvalidSegmentoException;

public class GeometriaTest {
	
	//********** Segmento Test
	
	@Test 
	public void crearSegmentoConextremosIgualesTest(){
		try {
			Segmento segmento = new Segmento(new Punto(1,1), new Punto(1,1));	
			System.out.println(segmento.toString());
			fail();
		}catch(InvalidSegmentoException ex) {
			System.err.println("Test - Se genera excepcion InvalidSegmentoException");
		}catch(Exception ex) {
			fail();
		}
	}
	
	@Test
	public void segmentoEsParaleloEjeXTest() {
		Segmento segmento = new Segmento(new Punto(1,1), new Punto(5,1));	
		assertEquals(true,segmento.paraleloEjeX());	
	}
	
	@Test
	public void segmentoNoEsParaleloEjeXTest() {
		Segmento segmento = new Segmento(new Punto(1,3), new Punto(5,1));	
		assertEquals(false,segmento.paraleloEjeX());	
	}
	
	@Test
	public void segmentoEsParaleloEjeYTest() {
		Segmento segmento = new Segmento(new Punto(2,1), new Punto(2,5));	
		assertEquals(true,segmento.paraleloEjeY());	
	}
	
	@Test
	public void segmentoNoEsParaleloEjeYTest() {
		Segmento segmento = new Segmento(new Punto(2,1), new Punto(5,2));	
		assertEquals(false,segmento.paraleloEjeY());	
	}
	
	@Test
	public void segmentoEsParaleloAOtroSegmentoTest() {
 		Segmento segmento = new Segmento(new Punto(1,4), new Punto(4,2));
 		Segmento otroSegmento = new Segmento(new Punto(2,8), new Punto(5,6));
		assertEquals(true,segmento.sonParalelosEntreSi(otroSegmento));	
	}
	
	@Test
	public void calcularLongitudSegmentoTest() {
		Segmento segmento = new Segmento(new Punto(1,1), new Punto(5,1));	
		assertEquals(4,segmento.calcularLongitud());	
	}
	
	@Test
	public void desplazarSegmentoTest() {
		Segmento segmento = new Segmento(new Punto(1,1), new Punto(5,1));
		segmento.desplazarExtremoA(2, 1);
		segmento.desplazarExtremoB(2, 1);		
		Segmento segmentoDesplazado = new Segmento(new Punto(3,2), new Punto(7,2));		
		assertEquals(true,segmento.equals(segmentoDesplazado));	
	}
	
	@Test
	public void compararSegmentoConOtroSegmentoTest() {
		Segmento segmento = new Segmento(new Punto(5,1), new Punto(15,1));
		Segmento otroSegmento = new Segmento(new Punto(6,3), new Punto(9,3));	
		assertEquals(1,segmento.compareTo(otroSegmento));	
	}
	
	
	//********** Elipse Test
	
	@Test
	public void elipseDesplazarCentroTest() {
		Elipse elipse = new Elipse(new Punto(3,2), 3, 2);
		elipse.desplazarCentro(4, 2);
		Elipse elipseDesplazado = new Elipse(new Punto(7,4), 3, 2);
		assertEquals(true,elipse.equals(elipseDesplazado));	
	}
	
	@Test
	public void elipseCalcularAreaTest() {
		Elipse elipse = new Elipse(new Punto(3,2), 3, 2);
		assertEquals(18.84955592153876,elipse.calcularArea());	
	}
	
	@Test
	public void compararElipseConOtroElipseTest() {
		Elipse elipse = new Elipse(new Punto(7,4), 7, 4);
		Elipse otroElipse = new Elipse(new Punto(3,2), 3, 2);
		assertEquals(1,elipse.compareTo(otroElipse));	
	}
	
	
	//********** Circulo Test
	
	@Test
	public void circuloDesplazarCentroTest() {
		Circulo circulo = new Circulo(new Punto(3,2), 3);
		circulo.desplazarCentro(4, 2);
		Circulo circuloDesplazado = new Circulo(new Punto(7,4), 3);
		assertEquals(true,circulo.equals(circuloDesplazado));	
	}
	
	@Test 
	public void crearCirculoConRadioCeroTest(){
		try {
			Circulo circulo = new Circulo(new Punto(3,2), 0);
			System.out.println(circulo.toString());
			fail();
		}catch(InvalidRadioException ex) {
			System.err.println("Test - Se genera excepcion InvalidRadioException");
		}catch(Exception ex) {
			fail();
		}
	}
	
	@Test
	public void circuloCalcularAreaTest() {
		Circulo circulo = new Circulo(new Punto(3,2), 3);
		assertEquals(28.274333882308138,circulo.calcularArea());	
	}
	
	@Test
	public void compararCirculoConOtroCirculoTest() {
		Circulo circulo = new Circulo(new Punto(3,2), 3);
		Circulo otroCirculo = new Circulo(new Punto(1,1), 1);
		assertEquals(1,circulo.compareTo(otroCirculo));	
	}

	
	//********** Rectangulo Test
	
	@Test
	public void rectanguloDesplazarPuntoIzqTest() {
		Rectangulo rectangulo = new Rectangulo(new Punto(1,1), new Punto(5,4));
		rectangulo.desplazarPuntoInfIzq(2, 1);
		rectangulo.desplazarPuntoSupDer(2, 1);
		Rectangulo rectanguloDesplazado = new Rectangulo(new Punto(3,2), new Punto(7,5));
		assertEquals(true,rectangulo.equals(rectanguloDesplazado));	
	}
	
	@Test
	public void rectanguloCalcularAreaTest() {
		Rectangulo rectangulo = new Rectangulo(new Punto(1,1), new Punto(5,4));
		assertEquals(12,rectangulo.calcularArea());	
	}
	
	@Test
	public void compararRectanguloConOtroRectanguloTest() {
		Rectangulo rectangulo = new Rectangulo(new Punto(1,1), new Punto(5,4));
		Rectangulo otroRectangulo = new Rectangulo(new Punto(1,1), new Punto(4,3));
		assertEquals(1,rectangulo.compareTo(otroRectangulo));	
	}
	
	
	//********** Cuadrado Test
	@Test 
	public void  crearCuadradoConLadoIgualACeroTest(){
		try {
			Cuadrado cuadrado = new Cuadrado(new Punto(1,1), 0);
			System.out.println(cuadrado.toString());
			fail();
		}catch(InvalidCuadradoException ex) {
			System.err.println("Test - Se genera excepcion InvalidCuadradoException");
		}catch(Exception ex) {
			fail();
		}
	}	
	
	@Test
	public void cuadradoDesplazarPuntoIzqTest() {
		Cuadrado cuadrado = new Cuadrado(new Punto(1,1), 2);
		cuadrado.desplazarPuntoInfIzq(4, 2);
		Cuadrado cuadradoDesplazado = new Cuadrado(new Punto(5,3), 2);
		assertEquals(true,cuadrado.equals(cuadradoDesplazado));	
	}
	
	@Test
	public void cuadradoCalcularAreaTest() {
		Cuadrado cuadrado = new Cuadrado(new Punto(1,1), 2);
		assertEquals(4,cuadrado.calcularArea());	
	}
	
	@Test
	public void compararCuadradoConOtroCuadradoTest() {
		Cuadrado cuadrado = new Cuadrado(new Punto(1,1), 4);
		Cuadrado otroCuadrado = new Cuadrado(new Punto(3,5), 2);
		assertEquals(1,cuadrado.compareTo(otroCuadrado));	
	}
		
		
	//********** Triangulo Test
	@Test
	public void desplazarTrianguloTest() {
		Triangulo triangulo = new Triangulo(new Punto(1,1), new Punto(5,1), new Punto(3,5));
		triangulo.desplazarVertice1(2, 1);
		triangulo.desplazarVertice2(2, 1);	
		triangulo.desplazarVertice3(2, 1);	
		Triangulo trianguloDesplazado = new Triangulo(new Punto(3,2), new Punto(7,2),new Punto(5,6));		
		assertEquals(true,triangulo.equals(trianguloDesplazado));	
	}
	
	@Test
	public void trianguloLadoParaleloEjeXTest() {
		Triangulo triangulo = new Triangulo(new Punto(1,1), new Punto(5,1), new Punto(1,6));		
		assertEquals(true, triangulo.ladoParaleloEjeX(new Punto(1,1), new Punto(5,1)));	
	}
	
	@Test
	public void trianguloLadoParaleloEjeYTest() {
		Triangulo triangulo = new Triangulo(new Punto(1,1), new Punto(5,1), new Punto(1,6));		
		assertEquals(true, triangulo.ladoParaleloEjeY(new Punto(1,1), new Punto(1,6)));	
	}
		
	@Test
	public void trianguloCalcularAreaTest() {
		Triangulo triangulo = new Triangulo(new Punto(1,1), new Punto(5,1), new Punto(3,5));
		assertEquals(8,triangulo.calcularArea());	
	}
	
	@Test
	public void compararTrianguloConOtroTrianguloTest() {
		Triangulo triangulo = new Triangulo(new Punto(1,1), new Punto(5,1), new Punto(3,5));
		Triangulo otroTriangulo = new Triangulo(new Punto(1,1), new Punto(3,1), new Punto(2,4));
		assertEquals(1,triangulo.compareTo(otroTriangulo));	
	}
	
	
	
	
}

