/**
 * 
 */
package tema6;

/**
 * @author Manuel Millón
 *
 */
public class Tema6Ejercicio7 {

	/**
	 * Es el ejercicio 7 en realidad. Escribe un programa que muestre tres apuestas
	 * de la quiniela en tres columnas para los partidos y el pleno al quince (15
	 * filas).
	 */
	public static void main(String[] args) {

		int resultado = 0; /* Declaramos e iniciamos resultado. */
		int columnas = 3; /* Declaramos el número de columnas. */

		for (int fila = 1; fila <= 15; fila++) { /* Creamos un relleno de 15 filas */
			System.out.printf("%5d  |", fila); /* Indicamos una fila, creamos un espacio y creamos en el resultado */
			/* una barra para separar el número de fila del resultado */

			if (fila == 15) {
				columnas = 1; /* Creamos una columna para el resultado. */
			}
			for (int apuesta = 1; apuesta <= columnas; apuesta++) { /*
																	 * Creamos un bucle de estiramiento de resultados,
																	 * empezando por el 1, hasta el 15.
																	 */
				resultado = (int) (Math.random() * 3 + 1); /* Número de opciones aleatorias. */
			}
			switch (resultado) { /* Damos valor a los resultados aleatorios. */
			case 1:
				System.out.println(" 1 |");
				break;
			case 2:
				System.out.println(" 2 |");
				break;
			case 3:
				System.out.println(" X |");
				break;
			default:
			}
		}
		System.out.println();

	}

}
