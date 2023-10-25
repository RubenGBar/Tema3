package for1;

import java.util.Scanner;

public class For1 {
	public static void main(String[] args) {
		
		//Creo la variable donde guardo el número a contar
		int numero;
		
		//Creo el Scanner 
		Scanner sc = new Scanner(System.in);
		
		//Muestro un mensaje por pantalla con las instrucciones del programa
		System.out.println("Introduzca un número, para contar hasta ese número: ");
		
		//Leo el valor de número del teclado
		numero = sc.nextInt();
		
		/*Creo un bucle de tipo for en el que declaro una varibale usada como un contador, lo inicializo y 
		 *lo voy aumentando en 1 minetras lo muestro por pantalla hasta que sea mayor que el 
		 *número introducido por el usuario*/
		for (int i = 0; i <= numero; i++) {
			System.out.println(i);
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
