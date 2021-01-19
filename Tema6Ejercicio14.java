/**
 * 
 */
package tema6;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema6Ejercicio14 {

	/**
	 * 14. Escribe un programa que piense un n�mero al azar entre 0 y 100. El
	 * usuario debe adivinarlo y tiene para ello 5 oportunidades. Despu�s de cada
	 * intento fallido, el programa dir� cu�ntas oportunidades quedan y si el n�mero
	 * introducido es menor o mayor que el que ha pensado
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int numeroAlAzar = (int) (Math.random() * 100) + 1;
		int intentos = 6;
		int numeroIntroducido;
		boolean acierto = false;
		do {
			System.out.print("Por favor, introduzca el número aleatorio entre 1 y 100 y después INTRO: ");
			numeroIntroducido = keyboard.nextInt();
			intentos--;
			
			if (numeroIntroducido == numeroAlAzar) {
				acierto = true;
			}
			if (numeroIntroducido < numeroAlAzar) {
				System.out.println("Número incorrecto. El número introducido es menor que el buscado. Te quedan "
						+ (intentos -1) + " intentos.");
			}
			if (numeroAlAzar < numeroIntroducido) {
				System.out.println("Número incorrecto. El número introducido es mayor que el buscado. Te quedan "
						+ (intentos -1) + " intentos.");
			}
			if (acierto) {
				System.out.println("Enhorabuena, has acertado el número.");
			}
			else {
				if(intentos == 0) {
					System.out.println("Lo siento, se acabaron las oportunidades");
			}
			}
		} while (intentos > 1);

	}
}
