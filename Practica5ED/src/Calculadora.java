
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
