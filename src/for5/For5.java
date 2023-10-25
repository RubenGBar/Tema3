package for5;

import java.util.Scanner;

public class For5 {
	public static void main(String[] args) {
		
		/*Declaro las variables donde guardo el número introducido por el teclado, la suma de estos y 
		 *el contador del bucle*/
		int numeroTeclado, suma = 0, i = 0;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		/*Creo un bucle donde inicializo el bucle en 1, lo voy aumentando en 1 e iterará hasta
		 *que sea menor o igual que 10. Dentro del bucle sumaré los números que el usuario vaya 
		 *introduciendo en cada iteración*/
		for (i = 1; i <= 10; i++) {
			
			System.out.println("Introduzca un número: ");
			
			numeroTeclado = sc.nextInt();
			
			suma += numeroTeclado;
		}
		
		//Muestro la media de la suma de los números introducidos
		System.out.println("La media de los números es: " + suma/i);
		
		//Cierro el Scanner
		sc.close();
		
	}

}
