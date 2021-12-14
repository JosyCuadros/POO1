package cubo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CuboTest {
		
		static Cubo cubito;
		
	@BeforeAll
	public static void setUp() throws Exception {
		cubito = new Cubo(5);
	}
	
	@Test
	public void crearCuboTest() {
		assertNotNull(cubito);
	}
	
	@Test
	public void cambiarLongitudLadoCuboTest() {
		cubito.cambiarLongitudLado(4);
		assertEquals(4, cubito.medirLongitudLado());
	}
	
	@Test
	public void medirLongitudLadoCuboTest() {
		assertEquals(5, cubito.medirLongitudLado());
	}
	
	@Test
	public void superficieCaraCuboTest() {
		assertEquals(16, cubito.medirSuperficieCara());
	}
	
	@Test
	public void cambiarSuperficieCaraCuboTest() {
		cubito.cambiarSuperficieCara(16);
		assertEquals(16, cubito.medirSuperficieCara());
	}
	
	@Test
	public void medirVolumenCuboTest() {
	// el 0 es para la tolerancia de error	
		assertEquals(64, cubito.medirVolumen(),0);
	}
	
	@Test
	public void cambiarVolumenCuboTest() {
		cubito.cambiarVolumen(216);
	// el 0 es para la tolerancia de error	
		
		assertEquals(216, cubito.medirVolumen(),0);
	}
	
	
	

}
