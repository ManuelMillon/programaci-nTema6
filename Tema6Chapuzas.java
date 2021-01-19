/**
 * 
 */
package tema6;

/**
 * @author Usuario
 *
 */
public class Tema6Chapuzas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nota = "";
	for (int i = 0; i <4 ; i++) {
		
		int notas = (int) (Math.random() * 7) + 1;

		switch (notas) {
		case 1:
			nota = "do";
			break;
		case 2:
			nota = "re";
			break;
		case 3:
			nota = "mi";
			break;
		case 4:
			nota = "fa";
			break;
		case 5:
			nota = "sol";
			break;
		case 6:
			nota = "la";
			break;
		case 7:
			nota = "si";
			break;
		default:
		}
		
		System.out.print(nota + " ");
	}
	}
}
