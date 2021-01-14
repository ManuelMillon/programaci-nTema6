/**
 * 
 */
package tema6;

/**
 * @author Usuario
 *
 */
public class Tema6Prueba4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("10 núemros enteros aleatorios del -7 al 19");
		for (int i = 1; i < 100; i++) {
			System.out.println((int)(Math.random() * ( 19 + 7 + 1)) -7);
		}
	}

}
