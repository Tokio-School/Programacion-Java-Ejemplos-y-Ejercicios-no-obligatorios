import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class CalculadoraFinalTest {

	@Test
	
	void testSumar() {
		//fail("Not yet implemented");
		CalculadoraFinal calc = new CalculadoraFinal();
		assertEquals(165, calc.sumar(77, 88));
		assertEquals(166, calc.sumar(77, 89));
		assertEquals(167, calc.sumar(78, 89));
		assertEquals(3, calc.sumar(3, 0));
		
		assertNotEquals(1, calc.sumar(77, 89));
		
		
		assertTrue(calc.sumar(1, 2) == 3);
		
		assertFalse(calc.sumar(1, 2) == 4);
		
		
		
		
		
	}

	@Test
	@ParameterizedTest
	//@CsvSource({"40,46,1840","93,65,6045","37,64,2368","45,34,1530","1,3,3"})
	@CsvFileSource(resources = "/datosMultiplicacion.csv", numLinesToSkip = 1)	
	void testMultiplica(int a,int b,int resultado) {
		CalculadoraFinal calc = new CalculadoraFinal();
		assertEquals(resultado, calc.multiplica(a, b));
	}

	@Test
	void testDivide() {
		fail("Not yet implemented");
	}

	@Test
	void testResta() {
		fail("Not yet implemented");
	}

}
