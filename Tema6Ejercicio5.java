/**
 * 
 */
package tema6;

/**
 * @author Usuario
 *
 */
public class Tema6Ejercicio5 {

	/**
	 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
	 * separados por espacios. Muestra también el máximo, el mínimo y la media
	 * de esos números.
	 */
	public static void main(String[] args) {
		
	    int minimo = 199;
	    int maximo = 100;
		int suma = 0;
		int numero;
       
	    for (int i = 0; i < 50; i++) {    
	        numero = (int) (Math.random() * 100 + 100);
	        
	        
	        System.out.print(numero + " ");
	        suma += numero;
	        
	        if (numero < minimo) {
	        	minimo = numero;
	        }
	        if (numero > maximo) {
	        	maximo = numero;
	        }
	        	        
	    }
	    System.out.println("\nMinimo: " + minimo + "\nMaximo: " + maximo + "\nMedia: " + suma / 50);
	}

}
