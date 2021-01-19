/**
 * 
 */
package tema6;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema6Ejercicio22 {

	/**
	 * Ejercicio 22 Realiza un programa que pinte por pantalla una serpiente con un
	 * “serpenteo” aleatorio. La cabeza se representará con el carácter @ y se debe
	 * colocar exactamente en la posición 13 (con 12 espacios delante). A partir de
	 * ahí, el cuerpo irá serpenteando de la siguiente manera: se generará de forma
	 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
	 * coloque una posición a la izquierda del anterior, alineado con el anterior o
	 * una posición a la derecha del anterior. La longitud de la serpiente se pedirá
	 * por teclado y se supone que el usuario introducirá un dato correcto.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Imprime el largo de la serpiente: ");
		int largo = sc.nextInt();
		
		int espacio = 13;
		System.out.println("            @");
		while (largo >0) {
			
			espacio += (int) ((Math.random() * 3) - 1);
			
			for (int i = 1; i < espacio; i++) {
				System.out.print(" ");

			}
			System.out.println("*");

			largo--;
		}

	
	

	}

}
