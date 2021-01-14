/**
 * 
 */
package tema6;

/**
 * @author Manuel Millón
 *
 */
public class Tema6Ejercicio9 {

	/**
	 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100
	 * y que no termine de generar números hasta que no saque el 24. El programa
	 * deberá decir al final cuántos números se han generado.
	 */
	public static void main(String[] args) {

		int numeroBuscado = 0;  				/*Inicio variable*/
		int elementosGenerados = 0;				/*Inicio variable*/
		
		while (numeroBuscado != 24) {
			numeroBuscado = (int) (Math.random() * 51) *2;
			System.out.print(numeroBuscado + " ");
			elementosGenerados++;                     	/*Esto te sirve también como contador de repetición con el while. Primero declaras la operación. */
	}								  					/*Luego, el print. Y al final la evolución*/
			System.out.println("\nEn total han salido " + elementosGenerados + " números."); /*La impresión entra en bucle automáticamente*/

	}

}
