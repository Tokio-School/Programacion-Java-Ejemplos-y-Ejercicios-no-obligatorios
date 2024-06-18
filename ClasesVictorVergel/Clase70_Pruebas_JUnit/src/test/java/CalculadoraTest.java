import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	static CalculadoraFinal calc ;
	
	@BeforeAll
	public static void inicializa() {
		System.out.println("Empezando los tests");
		calc = new CalculadoraFinal();
	}
	
	@AfterAll
	public static void limpiaSistema() {
		System.out.println("Finalizando los test");
		calc=null;
		System.gc();
	}
	
	@BeforeEach
	public void antesDeCadaTest() {
		System.out.println("Vamos a realizar un test");
	}
	
	@AfterEach
	public void despuesDeCadaTest() {
		System.out.println("Test realizado");
	}
	
	
	@Test
	@DisplayName("Test de la suma")
	public void testSumar() {
		
		assertEquals(16, calc.sumar(7, 9));
		assertEquals(6, calc.sumar(2, 4));
		assertEquals(13, calc.sumar(7, 6));
		assertEquals(14, calc.sumar(7, 7));
		assertNotEquals(27, calc.sumar(7, 19));
		assertTrue(calc.sumar(7, 9)==16);
		assertFalse(calc.sumar(7, 9)==17);
		assertTrue(calc.equals(new CalculadoraFinal()));
		assertFalse(calc.equals(new Object()));
		
	}
	
	@Test
	@DisplayName("Test de la resta")
	public void testRestar() {
		
		assertEquals(5, calc.resta(7, 2));
		
	}
	
	@Test
	@DisplayName("Test de la multiplicación")
	public void testMultiplicar() {
		//CalculadoraFinal calc = new CalculadoraFinal();
		assertEquals(63, calc.multiplica(7, 9));

	}
	
	
	@Test
	@DisplayName("Test de la división")
	public void testDivision() {
		//CalculadoraFinal calc = new CalculadoraFinal();
		assertEquals(2, calc.divide(4, 2));
		assertThrows(ArithmeticException.class, () -> calc.divide(4, 0));
	}
}

