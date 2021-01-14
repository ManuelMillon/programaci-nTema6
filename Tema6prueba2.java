/**
 * 
 */
package tema6;

/**
 * @author Usuario
 *
 */
public class Tema6prueba2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	for  (int i = 1; i <10; i++) {
			System.out.println(Math.random() * 6);
	}

	for  (int i = 1; i <10; i++) {
		System.out.println(Math.random() * 100);
}
	for  (int i = 1; i <10; i++) {
		System.out.println((int)(Math.random() * 6) + 1); /* Sumar 1 modifica el intervalo */
}
	for  (int i = 1; i <10; i++) {
		System.out.println((int)(Math.random() * 7)); /*Sale el 0 */
}
	for  (int i = 1; i <10; i++) {
		System.out.println((int)(Math.random() * 3) + 1); /*Sale el 0 */
}
	
	
	for  (int i = 1; i <10; i++) {
	switch ((int)(Math.random() * 3) + 1) {
	case 1:
	System.out.println("piedra");
	break;
	case 2:
	System.out.println("papel");
	break;
	case 3:
	System.out.println("tijera");
	break;
	default:
	}
	}
	
	
	
	
	}

}
