import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calculadora = new Calculadora(2,2);
		int resultado = calculadora.sumar();
		assertEquals(4, resultado);
	}

	@Test
	void testResta() {
		Calculadora calculadora = new Calculadora(2,3);
		int resultado = calculadora.restar();
		assertEquals(-1, resultado);
	}

	@Test
	void testMultiplicar() {
		Calculadora calculadora = new Calculadora(2,3);
		int resultado = calculadora.multiplicar();
		assertEquals(6, resultado);
	}

	@Test
	void testDividir() {
		Calculadora calculadora = new Calculadora(1,2);
		double resultado = calculadora.dividir();
		assertEquals(0.5, resultado);
	}

}
