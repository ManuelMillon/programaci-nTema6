/**
 * 
 */
package tema6;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema6Ejercicio2 {

	/**
	 * 4. Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
	 * separados por espacios.

	 */
	public static void main(String[] args) {
		for (int i = 0; i <20 ; i++) {
			int numero = (int)(Math.random() * 10 + 1); // se puede definir un n�mero entero como un conjunto de tiradas aleatorias.
			System.out.print(numero + " ");
		}
		
	}

}
