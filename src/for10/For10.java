package for10;

import java.util.Scanner;

public class For10 {
	public static void main(String[] args) {
		
		/*Declaro las variables donde guardaré los dos números introducidos, la resta de estos y el 
		 *contador del bucle for*/
		int numeroA, numeroB, resta, i;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Muestro un mensaje por pantalla para que me introduzca un número
		System.out.println("Introduzca un primer número: ");
		
		//Leo el valor de numeroA del teclado
		numeroA = sc.nextInt();
		
		//Muestro un mensaje por pantalla para que me introduzca otro número
		System.out.println("Introduzca un segundo número mayor que el primero: ");
		
		//Leo el valor de numeroB del teclado
		numeroB = sc.nextInt();
		
		/*Resto el numeroA al numeroB para que el bucle solo itere el número de veces que necesito para 
		 *imprimir los números desde A hasta B*/
		resta = numeroB - numeroA;
		
		/*Creo un bucle de tipo for donde inicializo la variable i en 0 y el número de veces que iterará 
		 *el bucle será igual a la distancia entre numeroB y numeroA. Dentro del bucle imprimiré ese 
		 *número por cada iteración*/
		for (i = 0; i <= resta; i++) {
			System.out.println(numeroA++);
		}
		
		//Cierro el Scanner
		sc.close();
		
	}

}
