/**
 * 
 */
package tema6;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema6Ejercicio10 {

	/**
	 * * 10. Realiza un programa que pinte por pantalla diez líneas formadas por
	 * caracteres. El caracter con el que se pinta cada línea se elige de forma
	 * aleatoria entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben
	 * tener una longitud aleatoria entre 1 y 40 caracteres.
	 * 
	 */
	public static void main(String[] args) {

		int opcion = 0;
		for (int i = 1; i < 11; i++) {
			int longitud = (int) (Math.random() * 40) + 1;
			for (int n = 1; n <= longitud; n++) {
				opcion = (int) (Math.random() * 6) + 1;
				String caracter = "";
				switch (opcion) {
				case 1:
					caracter = "*"; /* Pongo la variable de string */
					break;
				case 2:
					caracter = "-";
					break;
				case 3:
					caracter = "=";
					break;
				case 4:
					caracter = "�";
					break;
				case 5:
					caracter = "|";
					break;
				case 6:
					caracter = "@";
					break;
				default:
				}
				System.out.print(caracter);
			}
			System.out.println();
		}

	}

}
