# Practica5 <br> Francisco José Almansa Martínez | Marc Sancho Santandreu
Creación de la interfaz y clase Calculadora con sus respectivas pruebas de los metodos sumar, restar, multiplicar y dividir realizadas con JUnit.
## Interfaz Calculadora
```
public interface ICalculadora {

		/**
		 * Metodo sumar. Suma el primer numero con el segundo.
		 * @return resultado de la suma en formato integer.
		 */
		public int sumar();

		/**
		 * Metodo restar. Resta el primer numero con el segundo.
		 * @return resultado de la resta en formato integer.
		 */
		public int restar();
		
		/**
		 * Metodo multiplicar. Multiplica el primer numero con el segundo.
		 * @return resultado de la multiplicacion en formato integer.
		 */
		public int multiplicar();
		
		/**
		 * Metodo dividir. Divide el primer numero con el segundo.
		 * @return resultado de la división en formato double.
		 */
		public double dividir();
}
```

## Clase Calculadora
```
public class Calculadora implements ICalculadora {
	private int numero1;
	private int numero2;
	
	/**
	 * Constructor completo de Calculadora.
	 * @param numero1 primer numero.
	 * @param numero2 segundo numero.
	 */
	public Calculadora(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public int sumar () {
		return this.numero1+this.numero2;
	}
	
	
	public int restar () {
		return this.numero1-this.numero2;
	}
	
	
	public int multiplicar() {
		return this.numero1*this.numero2;
	}
	

	public double dividir() {
		return (double)this.numero1/this.numero2;
	}
}
```

## Clase CalculadoraTests (Tests JUnit)
```
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
```

## Resultado de JUnit
![image](https://user-images.githubusercontent.com/91600940/168426621-d7cbd620-1931-4353-af29-c26df41cd130.png)
![image](https://user-images.githubusercontent.com/91600940/168426639-4537d44d-c057-4160-b7d5-f1935a31e209.png)

## Diagrama de las ramas del proyecto
Decidimos utilizar esta segunda rama *develop* para hacer cambios en la estructura de las clase e interfaz debido a que nos dimos cuenta que no estaba del todo bien enfocada en un primer momento, además de ya hacer los test de JUnit.<br>
![image](https://user-images.githubusercontent.com/91600940/168426822-b09b5dc2-fad0-463f-bba5-29355e3193bc.png)
