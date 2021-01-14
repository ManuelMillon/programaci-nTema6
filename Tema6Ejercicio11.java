/**
 * 
 */
package tema6;

/**
 * @author Manuel Millón
 *
 */
public class Tema6Ejercicio11 {

	/**
	 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la
	 * forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de
	 * suspensos, el número de suficientes, el número de bienes, etc.
	 */
	public static void main(String[] args) {
		
		int punto = 0; 			
		int suspenso = 0;
		int bien = 0;
		int aprobado = 0;
		int notable = 0;
		int sobresaliente = 0;
		for (int i = 1; i <= 20; i++) {
		String evaluacion = "";					
		
		for (i = 1; i < 21 ; i++) {
		punto = (int) (Math.random() * 5) + 1; 	
		
		switch (punto) {    						
		case 1:
			evaluacion = "Suspenso"; 				
			suspenso++;		
			break;
		case 2:
			evaluacion = "Aprobado";
			aprobado++;
			break;
		case 3:
			evaluacion = "Bien";
			bien++;
			break;
		case 4:
			evaluacion = "Notable";
			notable++;
			break;
		case 5:
			evaluacion = "Sobresaliente";
			sobresaliente++;
			break;
		default:
		}
		System.out.println(evaluacion);
		}
		}
		System.out.println("Numero de suspensos: " + suspenso);
		System.out.println("Numero de aprobados: " + aprobado);
		System.out.println("Numero de bienes: " + bien);
		System.out.println("Numero de notables: " + notable);
		System.out.println("Numero de sobresalientes: " + sobresaliente);

	}

}
