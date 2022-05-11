
public class Calculadora implements ICalculadora {
	private int num1;
	private int num2;
	

	/**
	 * Constructor completo de Calculadora
	 * @param num1 primer numero
	 * @param num2 segundo numero
	 */
	public Calculadora(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int suma () {
		int resultado = this.num1+this.num2;
		return resultado;
	}
	
	public int resta () {
		int resultado = this.num1-this.num2;
		return resultado;
	}
	
	
	public int multiplicar() {
		int resultado = this.num1*this.num2;
		return resultado;
	}
	
	public int dividir() {
		int resultado = this.num1/this.num2;
		return resultado;
	}

}
