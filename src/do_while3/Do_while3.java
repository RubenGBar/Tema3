package do_while3;

import java.util.Scanner;

public class Do_while3 {
	public static void main(String[] args) {
		
		/*Declaro las variables donde crearé un contador, guardo el número introducido por el usuario y 
		 *sumo los números desde 1 hasta el número introducido*/
		int cont = 0, num, suma = 0;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Muestro un mensaje por pantalla para avisar al usuario de lo que va a hacer el programa
		System.out.println("Introduzca un número para sumarlo junto sus números anteriores: ");
		
		//Leo el valor de num del teclado
		num = sc.nextInt();
		
		/*Creo el bucle donde sumo todos los números desde el 1 hasta el número introducido
		 *(basicamente el teorema de Gauss). Esto lo hago incrementando el contador por cada iteración del bucle y
		 *sumo cada número del contador en otra variable*/
		do {
			suma +=cont;
			
			cont++;
		}while (cont <= num);
		
		//Muestro el resultado de la suma cuando haya terminado el bucle
		System.out.println("La suma desde el número 1 hasta el " + num + " es igual a: " + suma);
		
		//Cierro el Scanner
		sc.close();
	}

}
