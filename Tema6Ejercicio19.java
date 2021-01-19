/**
 * 
 */
package tema6;

/**
 * @author Usuario
 *
 */
public class Tema6Ejercicio19 {

	/**
	 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
	 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
	 * luego el máximo de los pares el mínimo de los impares y la media de todos los
	 * números generados.
	 */
	public static void main(String[] args) {

		int numero = 0;
		int maximoPar = -100;
		int minimoImpar = 200;
		int suma = 0;

		for (int i = 0; i < 50; i++) {
			numero = (int) (Math.random() * 200 - 100 + 1);

			System.out.println(numero + " ");

			if (numero % 2 == 0) {
					if (numero > maximoPar) {
						maximoPar = numero;
					}
				} else {
					if (numero < minimoImpar) {
						minimoImpar = numero;
					}
				}

			

			suma = +numero;
		}
		System.out.println("El menor de los impares es " + minimoImpar);
		System.out.println("El mayor de los pares es " + maximoPar);
		int media = suma / 50;
		System.out.println("La media de todos los números generados es " + media);

	}

}
