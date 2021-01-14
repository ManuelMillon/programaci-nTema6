/**
 * 
 */
package tema6;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema6Ejercicio9 {

	/**
	 * Realiza un programa que vaya generando n�meros aleatorios pares entre 0 y 100
	 * y que no termine de generar n�meros hasta que no saque el 24. El programa
	 * deber� decir al final cu�ntos n�meros se han generado.
	 */
	public static void main(String[] args) {

		int numeroBuscado = 0;  				/*Inicio variable*/
		int elementosGenerados = 0;				/*Inicio variable*/
		
		while (numeroBuscado != 24) {
			numeroBuscado = (int) (Math.random() * 51) *2;
			System.out.print(numeroBuscado + " ");
			elementosGenerados++;                     	/*Esto te sirve tambi�n como contador de repetici�n con el while. Primero declaras la operaci�n. */
	}								  					/*Luego, el print. Y al final la evoluci�n*/
			System.out.println("\nEn total han salido " + elementosGenerados + " n�meros."); /*La impresi�n entra en bucle autom�ticamente*/

	}

}
