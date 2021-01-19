/**
 * 
 */
package tema6;

import java.util.Iterator;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio16 {

	/**
	 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
	 * siguientes requisitos: a) El ordenador mostrará una tirada que consiste en
	 * mostrar 3 figuras. Hay 5 figuras posibles: corazón, diamante, herradura,
	 * campana y limón. b) Si las tres figuras son diferentes se debe mostrar el
	 * mensaje “Lo siento, ha perdido”. c) Si hay dos figuras iguales y una
	 * diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”. d) Si
	 * las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10
	 * monedas”.
	 */
	public static void main(String[] args) {

		int figura1 = 0;
		int figura2 = 0;
		int figura3 = 0;
		String figura = "";
		for (int i = 1; i < 4; i++) {
			int numero = (int) (Math.random() * 5 + 1); // se puede definir un número entero como un conjunto de tiradas
														// aleatorias.

			switch (numero) {
			case 1:
				figura = "diamante";
				break;
			case 2:
				figura = "herradura";
				break;
			case 3:
				figura = "campana";
				break;
			case 4:
				figura = "corazón";
				break;
			case 5:
				figura = "limón";
				break;
			default:
			}
				System.out.print(figura + " ");
			
				switch (i) {
				case 1:
					figura1 = numero;
					break;
				case 2:
					figura2 = numero;
					break;
				case 3:
					figura3 = numero;
					break;
				default:
				}

				if ((figura1 == figura2) && (figura2 == figura3))
					;
				System.out.println("Enhorabuena, le ha tocado el bote.");
			}
			if ((figura1 == figura2) || (figura2 == figura3) || (figura1 == figura3)) {
				System.out.println("Aquí tiene su moneda. Vuelva a tratar de perderla.");
			}
			if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {

				System.out.println("Fin de la partida");
			
		}
	}

}
