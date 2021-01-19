/**
 * 
 */
package tema6;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema6Ejercicio4 {

	/**
	 * 2. Realiza un programa que muestre al azar el nombre de una carta de la
	 * baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
	 * diamantes y tréboles. Cada palo est� formado por 13 cartas, de las cuales 9
	 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A
	 * (que sería el 1). Para convertir un n�mero en una cadena de caracteres
	 * podemos usar String.valueOf(n).
	 * 
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 1; i++) {

			String palo = "";
			String figura = "";

			int numeroCarta = (int) (Math.random() * 13 + 1);

			switch (numeroCarta) {
			case 1:
				figura = "el as";
				break;
			case 11:
				figura = "la J";
				break;
			case 12:
				figura = "la Q";
				break;
			case 13:
				figura = "la K";
				break;
			default:
				figura = String.valueOf(numeroCarta);
			}

			int numeroPalo = (int) (Math.random() * 4 + 1);

			switch (numeroPalo) {
			case 1:
				palo = "picas";
				break;
			case 2:
				palo = "corazones";
				break;
			case 3:
				palo = "tréboles";
				break;
			case 4:
				palo = "rombos";
				break;
			default:

			}

			System.out.println("La carta obtenida es el " + figura + " de " + palo + ".");

		}
	}
}
