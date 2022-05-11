
public class Calculadora implements ICalculadora {
	/**
	 * @param a primer numero
	 * @param b segundo numero
	 * @return a+b suma de los numeros
	 */
	public int suma (int a, int b) {
		return a+b;
	}
	
	/**
	 * @param a primer numero
	 * @param b segundo numero
	 * @return a-b resta del primer al segundo numero
	 */
	public int resta (int a, int b) {
		return a-b;
	}
	
	/**
	 * @param a primer numero
	 * @param b segundo numero
	 * @return a+b multiplicación de los numeros
	 */
	public int multiplicar(int a, int b) {
		return a*b;
	}
	
	/**
	 * @param a primer numero
	 * @param b segundo numero
	 * @return a+b división de los numeros
	 */
	public int dividir(int a, int b) {
		return a/b;
	}
}
