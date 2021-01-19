/**
 * 
 */
package tema6;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema6Ejercicio6 {

	/**
	 * Escribe un programa que piense un n�mero al azar entre 0 y 100. El usuario
	 * debe adivinarlo y tiene para ello 5 oportunidades. Despu�s de cada intento
	 * fallido, el programa dirá cuántas oportunidades quedan y si el número
	 * introducido es menor o mayor que el que ha pensado.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero;
		int intentos = 5;
		int numeroIntroducido;
		boolean acierto = false;
		int numeroAleatorio = (int) (Math.random() * 101);

		do {
			System.out.println("Por favor, intente acertar el número: ");
			numeroIntroducido = teclado.nextInt();

		if (numeroIntroducido == numeroAleatorio) {
				acierto = true;
			} else {
				System.out.println("Lo siento, te quedan " + (intentos -1) + " oportunidades");
			}

			intentos--;

		} while ((intentos > 0) && (!acierto));

		if (acierto) {
			System.out.println("Eres un genio. Has acertado el n�mero buscado");
		} else {
			System.out.println("Se acabaron las oportunidades.");
		}

	}
}
