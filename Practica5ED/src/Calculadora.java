
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
	
	public int suma () {
		return this.numero1+this.numero2;
	}
	
	
	public int resta (int a, int b) {
		return this.numero1-this.numero2;
	}
	
	
	public int multiplicar(int a, int b) {
		return this.numero1*this.numero2;
	}
	

	public double dividir(int a, int b) {
		return this.numero1/this.numero2;
	}
}
