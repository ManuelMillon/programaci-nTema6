/**
 * 
 */
package tema6;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema6Ejercicio12 {

	/**
	 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
	 * con el c�digo ascii entre el 32 y el 126. Puedes hacer casting con (char) para
	 *convertir un entero en un car�cter.
	 */
	public static void main(String[] args) {

		for(int i = 0; i < 26; i++) {
			System.out.println((char)(Math.random() * (126 - 32 + 1) + 32));
        }
	}
}
