package while8;

import java.util.Scanner;

public class While8 {
	public static void main(String[] args) {
		
		//Creo las variables donde guardo el árbol introducido y el árbol más alto
		int arbolIntroducido = 0, arbolGuardar = 0;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creo un bucle que iterará mientras 
		while (arbolIntroducido > -1) {
			
			/*Mensaje para que introduzca la altura de un árbol y las instrucciones para que 
			 * sepa como terminar*/ 
			System.out.println("Introduzca la altura de un árbol en centímetros y sin decimales, si "
					+ "quiere terminar introduzca -1: ");
			
			/*Compruebo que el último valor introducido sea mayor que el guardado, si lo es guardo el 
			 * nuevo valor introducido*/
			if (arbolIntroducido > arbolGuardar) {
				arbolGuardar = arbolIntroducido;
			}
			
			//Leo el valor del arbol introducido del teclado
			arbolIntroducido = sc.nextInt();
			
		}
		
		//Cuando termine el bucle muestro el valor del árbol más alto introducido
		System.out.println("La altura del árbol más alto es de " + arbolGuardar + " metros");
		
		//Cierro el Scanner
		sc.close();
	}

}
