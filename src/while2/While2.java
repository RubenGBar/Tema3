package while2;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
	
		/*Declaro las variables donde guardo el número que introduce el usuario, una para sumar los números dentro del bucle
		y otra para ir aumentandola por cada iteración del bucle*/
		int num1, cont = 0;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido que introduzca un número y le digo lo que ocurre si es negativo o positivo
		System.out.println("Introduzca un número: ");
		
		//Leo el valor de num1 del teclado
		num1 = sc.nextInt();
		
		//Creo el bucle que hirá iterando hasta que el usuario quiera acabar
		while (num1 >= 0) {
			
			//Le pido al usuario que introduzca un número
			System.out.println("Introduce un número: ");
			
			//Vuelvo a leer el valor de num1 del teclado
			num1 = sc.nextInt();
			
			//Voy sumando la variable cont para saber cuantos número positivos ha introducido
			cont++;
		}
		
		//Cuando termine el bucle muestro las veces que ha iterado
		System.out.println("Ha introducido " + cont + " número/s positivo/s");
		
		
		//Cierro el Scanner
		sc.close();
	}
}
