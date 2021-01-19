/**
 * 
 */
package tema6;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema6Ejercicio20 {

	/**
	 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
	 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
	 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
	 * pueda admitir. El ancho de la cuba no varía.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la capacidad de la cuba: ");
		int capacidad = sc.nextInt();
		int agua = 0;
		agua = (int)(Math.random() * capacidad + 1);
		int contadorAgua = 0;
		int anchura = 4;

		for (int i = 0; i < capacidad; i++) {
			if (i < (capacidad - agua)) {
				System.out.println("*    *");
			} else {
				System.out.println("*====*");
			}
			}
		System.out.println("******");
		System.out.print("La cuba tiene una capacidad de " + capacidad);
		System.out.print(" litros y contiene " + agua + " litros de agua.");
	}
}
