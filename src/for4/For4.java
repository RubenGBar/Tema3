package for4;

import java.util.Scanner;

public class For4 {
	public static void main(String[] args) {
		
		//Declaro la variable donde guardo el número hasta el que se mostrarán los múltiplos de 3
		int numero;
		
		//Creo el Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pido al usuario que introduzca un número y lo que ocurrirá cuando lo haga
		System.out.println("Introduzca un número hasta el que se mostrarán los números que son múltiplos de 3");
		
		//Leo el valor de numero del teclado
		numero = sc.nextInt();
		
		/*Creo un bucle con una variable que usaré como contador y que aumentará de 1 en 1, el bucle iterará hasta 
		 *que este contador sea menor o igual que el número introducido por el usuario. El programa lo que hará en 
		 *cada iteración es mostrar los números que al dividirlos entre 3 den 0*/
		for (int i = 1; i <= numero; i++) {
			
			if (i % 3 == 0) System.out.println(i);
		}
		
		//Cierro el Scanner
		sc.close();
		
	}

}
