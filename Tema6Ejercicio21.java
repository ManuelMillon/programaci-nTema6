/**
 * 
 */
package tema6;

/**
 * Ejercicio 21 Realiza un programa que genere una secuencia de cinco monedas de
 * curso legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2
 * céntimos, 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2
 * euros. Las dos posiciones posibles son cara y cruz.
 *
 */
public class Tema6Ejercicio21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String moneda = "";
		String resultado = "";
		int dinero = 0;
		int posicion = 0;

		for (int i = 1; i < 6; i++) {
			dinero = (int) (Math.random() * 8 + 1);

			switch (dinero) {
			case 1:
				moneda = "1 céntimo";
				break;
			case 2:
				moneda = "2 céntimos";
				break;
			case 3:
				moneda = "5 céntimos";
				break;
			case 4:
				moneda = "10 céntimos";
				break;
			case 5:
				moneda = "20 céntimos";
				break;
			case 6:
				moneda = "50 céntimos";
				break;
			case 7:
				moneda = "1 euro";
				break;
			case 8:
				moneda = "2 euros";
				break;
			default:
			}

			posicion = (int) (Math.random() * 2 + 1);
			switch (posicion) {
			case 1:
				resultado = "cara";
				break;
			case 2:
				resultado = "cruz";
				break;
			default:
			}
			System.out.println("El resultado del lanzamiento " + i);
			System.out.println("es una moneda de" + moneda + ", " + resultado + ".");
		}

	}

}
