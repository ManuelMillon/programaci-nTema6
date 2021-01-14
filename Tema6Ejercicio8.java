/**
 * 
 */
package tema6;

/**
 * @author Manuel Millón
 *
 */
public class Tema6Ejercicio8 {

	/**
	 * 7. 8. Modifica el programa anterior para que la probabilidad de que salga un "1" sea de 1/2,
	 * la probabilidad de que salga "x" sea de 1/3 y la probabilidad de que salga "2" sea de 1/\6
	 * Nótese que 1/2 = 3/6 y 1/3 = 2/6.
	 */
	
	public static void main(String[] args) {

		int resultado = 0;   /*Declaramos e iniciamos resultado.*/
		int columnas = 3;    /*Declaramos el número de opciones en columnas.*/
		
		for (int fila = 1; fila <=15; fila++) {    /*Creamos un relleno de 15 filas */
			System.out.printf("%5d  |", fila);     /*Indicamos una fila, creamos un espacio y creamos en el resultado */
												   /*una barra para separar el número de fila del resultado*/
			
			if (fila == 15) {
				columnas = 1;   					/*Creamos una columna para el resultado.*/
			}
			for (int apuesta = 1; apuesta <= columnas; apuesta++) {     /*Creamos un bucle de estiramiento de resultados, empezando por el 1, hasta el 15.*/
				resultado = (int)(Math.random() * 6 + 1);    /*Número de opciones aleatorias.*/
			}
			switch(resultado) {  /*Damos valor a los resultados aleatorios.*/
			case 1:
				System.out.println(" 1 |");
				break;										/*También se pueden apilar uno debajo los case 1, 2 y 3 (y los 4 y 5 por su cuenta) con un solo resultado*/
			case 2:
				System.out.println(" 1 |");
				break;
			case 3:
				System.out.println(" 1 |");
				break;
			case 4:
				System.out.println(" X |");
				break;
			case 5:
				System.out.println(" X |");
				break;
			case 6:
				System.out.println(" 2 |");
				break;
				default:
			}
		}
		System.out.println();
	
	}

}
