package for7;

import java.util.Scanner;

public class For7 {
	public static void main(String[] args) {
		
		/*Declaro las variables donde guardo el número a calcular el factorial y 
		 *otra en la que calcularé el factorial de ese número*/
		int factorial = 0, mult = 1;
		
		//Creo el Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pido que introduzcan un número
		System.out.println("Introduzca un número a calcular su factorial: ");
		
		//Leo el valor del número del teclado
		factorial = sc.nextInt();
		/*Creo un bucle en el que declaro una variable que usaré como contador que aumentará en 1 por 
		 *iteración e iterará hasta que sea menor o igual que el número a calcular el factorial. Dentro del
		 *bucle a la variable mult le asignaré y multiplicaré el valor de i*/
		for (int i = 1; i <= factorial; i++) {
			
			mult *= i;
			
		}
		//Muestro el valor del factorial del número introducido
		System.out.println("El factorial de " + factorial + " es: " + mult);
		
		//Cierro el Scanner
		sc.close();
	}

}
