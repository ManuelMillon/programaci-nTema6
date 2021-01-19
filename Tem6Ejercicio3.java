/**
 * 
 */
package tema6;

/**
 * @author Manuel Mill�n
 *
 */
public class Tem6Ejercicio3 {

	/**
	 * 3. Igual que el ejercicio anterior pero con la baraja espa�ola. Se utilizar� la baraja de
	 * 48 cartas: 2, 3, 4, 5, 6, 7, 8, 9, sota, caballo, rey y as
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {

			String palo = "";
			String figura = "";

			int numeroCarta = (int) (Math.random() * 13 + 1);
			
			switch (numeroCarta) {
				case 1:
					figura = " as";
					break;
				case 11:
					figura = "la sota";
					break;
				case 12:
					figura = "la reina";
					break;
				case 13:
					figura = " rey";
					break;
				default:
					figura = String.valueOf(numeroCarta);
			}

			int numeroPalo = (int) (Math.random() * 4 + 1);

			switch (numeroPalo) {
				case 1:
					palo = "oros";
					break;
				case 2:
					palo = "espadas";
					break;
				case 3:
					palo = "copas";
					break;
				case 4:
					palo = "bastos";
					break;
				default:
					
			}
		
			System.out.println("La carta obtenida es el " + figura + " de " + palo + ".");
			
		}
	}

}
