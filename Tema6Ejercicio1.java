/**
 * 
 */
package tema6;

/**
 * @author Manuel Millón
 *
 */
public class Tema6Ejercicio1 {

	/**
	 * 1. Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
	 * también la suma total (los puntos que suman entre los tres dados).
	 */

	public static void main(String[] args) {

		int dado1 = (int) (Math.random() * 6 + 1); // se puede definir un número entero como un conjunto de tiradas
													// aleatorias.
		int dado2 = (int) (Math.random() * 6 + 1);
		int dado3 = (int) (Math.random() * 6 + 1);
		int sumaDados = dado1 + dado2 + dado3;

		System.out.println(dado1 + "  " + dado2 + "  " + dado3 + "  " + sumaDados);
	}

}
