import static org.junit.jupiter.api.Assertions.*;

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

class CalculadoraFinalTest {

	static CalculadoraFinal calc ;
	
	@BeforeAll
	public static void init() {
		calc = new CalculadoraFinal();
		System.out.println("Inicializando pruebas de la calculadora");
	}
	
	@AfterAll
	public static void fin() {
		System.out.println("Finalizando pruebas de la calculadora");
		calc = null;
		System.gc(); //Llamada al garbage collector
	}
	
	
	
	
	
	@Test
	@DisplayName("Metodo de testeo de la suma")
	@Tag("produccion")
	void testSumar() {
		//fail("Not yet implemented");
		//CalculadoraFinal calc = new CalculadoraFinal();
		assertEquals(165, calc.sumar(77, 88));
		assertEquals(166, calc.sumar(77, 89));
		assertEquals(167, calc.sumar(78, 89));
		assertEquals(3, calc.sumar(3, 0));
		
		assertNotEquals(1, calc.sumar(77, 89));
		
		
		assertTrue(calc.sumar(1, 2) == 3);
		
		assertFalse(calc.sumar(1, 2) == 4);
		

	}
	
	@BeforeEach
	void testPrueba()
	{
		System.out.println("Prueba de test - antes de cada método de testeo");
	}

	@AfterEach
	void testPrueba2()
	{
		System.out.println("Prueba de test - despues de cada método de testeo");
	}
	

	@Test
	@Tag("desarrollo")
	@ParameterizedTest
	//@CsvSource({"40,46,1840","93,65,6045","37,64,2368","45,34,1530","1,3,3"})
	@CsvFileSource(resources = "/datosMultiplicacion.csv", numLinesToSkip = 1)	
	void testMultiplica(int a,int b,int resultado) {
		//CalculadoraFinal calc = new CalculadoraFinal();
		assertEquals(resultado, calc.multiplica(a, b));
	}

	@Test
	@DisplayName("Limite de tiempo division")
	void testDivide() {
		//CalculadoraFinal calc = new CalculadoraFinal();
		assertTimeout(Duration.ofMillis(1000), ()->{
			calc.divide(8, 2);
		});
	}

	@Test
	@DisplayName("Agrupacion asserts")
	void testResta() {
		//CalculadoraFinal calc = new CalculadoraFinal();
		assertAll(
				()->assertEquals(2, calc.resta(8, 6)),
				()->assertNotEquals(3, calc.resta(8, 6)),
				()->assertEquals(5,calc.resta(3, -2))
				);
		
	}

}
