import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calculadora = new Calculadora(2,2);
		int resultado = calculadora.suma();
		assertEquals(4,resultado);
	}

	@Test
	void testResta() {
		Calculadora calculadora = new Calculadora(2,2);
		int resultado = calculadora.resta();
		assertEquals(0,resultado);
	}

	@Test
	void testMultiplicar() {
		Calculadora calculadora = new Calculadora(2,3);
		int resultado = calculadora.multiplicar();
		assertEquals(6,resultado);
	}

	@Test
	void testDividir() {
		Calculadora calculadora = new Calculadora(2,2);
		int resultado = calculadora.dividir();
		assertEquals(1,resultado);
	}

}
