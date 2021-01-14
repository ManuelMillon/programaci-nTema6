/**
 * 
 */
package tema6;

/**
 * @author Manuel Millón
 *
 */
public class Tema6Ejercicio13 {

	/**
	 * Escribe un programa que simule la tirada de dos dados. El programa deberá
	 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
	 * dados tengan el mismo valor.
	 */
	public static void main(String[] args) {
		
		int dadoAzul = 0;
		int dadoRojo = 0;
		do {
			dadoAzul = (int) (Math.random() * 6) + 1;
			dadoRojo = (int) (Math.random() * 6) + 1;
			System.out.println("El dado azul saca " + dadoAzul + " y el dado rojo saca " + dadoRojo);

		} while (dadoAzul != dadoRojo);
		
	}

}
