import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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
	@Tag("produccion")
	@ParameterizedTest
	@CsvSource({"7,9,16", "2,4,6", "7,6,13", "7,7,14", "7,19,2" })
	public void testSumar(int a, int b, int resultado) {
		
		/*assertEquals(16, calc.sumar(7, 9));
		assertEquals(6, calc.sumar(2, 4));
		assertEquals(13, calc.sumar(7, 6));
		assertEquals(14, calc.sumar(7, 7));
		assertNotEquals(27, calc.sumar(7, 19));
		assertTrue(calc.sumar(7, 9)==16);
		assertFalse(calc.sumar(7, 9)==17);
		assertTrue(calc.equals(new CalculadoraFinal()));
		assertFalse(calc.equals(new Object()));*/
		assertEquals(resultado, calc.sumar(a, b));
		
	}
	
	@Test
	@ParameterizedTest
	@CsvFileSource(resources = "/datos.csv",numLinesToSkip = 1)
	public void susmasCSVFile(int a, int b, int resultado) {
		assertEquals(resultado, calc.sumar(a, b));
	}
	
	
	@Test
	@DisplayName("Limitación de tiempo")
	public void testTimeout() {
		assertTimeout(Duration.ofMillis(1000), () -> {
			//Thread.sleep(500);
			calc.sumar(7, 9);
		});
		
	}
	
	
	@Test
	@DisplayName("Agrupación de asserts")
	public void testAgrupacionValidaciones()
	{
		
		/*assertEquals(18, calc.sumar(7, 9));
        assertEquals(6, calc.sumar(2, 4));
        assertEquals(13, calc.sumar(7, 6));
        assertEquals(14, calc.sumar(7, 7));
        assertNotEquals(27, calc.sumar(7, 19));*/
		assertAll(
                () -> assertEquals(18, calc.sumar(7, 9)),
                () -> assertEquals(6, calc.sumar(2, 4)),
                () -> assertEquals(13, calc.sumar(7, 6)),
                () -> assertEquals(14, calc.sumar(7, 7)),
                () -> assertNotEquals(27, calc.sumar(7, 19))
                );
	}
	
	
	@Test
	@DisplayName("Test de la resta")
	@Tag("produccion")
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

