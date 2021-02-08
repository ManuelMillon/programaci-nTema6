/**
 * 
 */
package tema6;

/**
 * @author Usuario
 *
 */
public class Tema6Ejercicio23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String tirada = "";
		
		for (int i = 0; i < 6; i++) {
			switch ((int) (Math.random()* 6) + 1) {
			case 1:
				tirada = "AS";
			break;
			case 2:
				tirada = "K";
			break;
			case 3:
				tirada = "Q";
			break;
			case 4:
				tirada = "J";
			break;
			case 5:
				tirada = "10";
			break;
			case 6:
				tirada = "9";
				break;
				default:
			}
			
			System.out.print(tirada + " ");
		}

	}

}
