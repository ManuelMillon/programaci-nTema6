/**
 * 
 */
package tema6;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema6Ejercicio17 {

	/**
	 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
	 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
	 * serán de 4 unidades. No hay que comprobar que los datos se introducen
	 * correctamente; podemos suponer que el usuario los introduce bien. Dentro de
	 * la pecera hay que colocar de forma aleatoria un pececito, que puede estar
	 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
	 * rectángulo.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
		int altura = sc.nextInt();

		System.out.print("Por favor, introduzca la anchura de la pecera (como mínimo 4): ");
		int anchura = sc.nextInt();
		int pececillo = (int)(Math.random() * (altura) * (anchura));
		int contadorEspacios = 0;

		for (int i = 1; i <= anchura + 1; i++) {
			System.out.print("*");
		}
		System.out.println("");
		for (int i = 1; i < altura; i++) {

			System.out.print("*");
			for (int j = 1; j < anchura; j++) {
				if (contadorEspacios == pececillo) {
					System.out.print("&");
				} else {
					System.out.print(" ");
				}
				contadorEspacios++;
			}
			System.out.print("*");

			System.out.println("");
		}

		for (int m = 1; m <= anchura + 1; m++) {
			System.out.print("*");
		}
	}
}
