package while3;

import java.util.Scanner;

public class While3 {
	public static void main(String[] args) {
		
		/*Declaro las variables donde sumaré los números y donde los voy a guardar, otra donde 
		haré la media y un contandor para poder hacer la media y lo inicializo en 1 ya que le pido 
		el primer número fuera del bucle*/
		int suma = 0, numero, cont=1;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido al usuario que introduzca un número y le digo lo que ocurre si es negativo o positivo
		System.out.println("Introduzca un valor positivo para sumarlo, si quiere dejar de sumar introduzca un valor negativo");
		
		//Leo el valor de numero del teclado
		numero = sc.nextInt();
		
		//Creo el loop para sumar los números
		while (numero >= 0) {
			
			//Sumo y asigno el valor añadido anteriormente a la variable suma
			suma += numero;
			
			//Vuelvo a pedir al usuario que introduzca un número y le explico lo que ocurre si es negativo o positivo
			System.out.println("Introduzca un valor positivo para sumarlo, si quiere dejar de sumar introduzca un valor negativo");
			
			//Leo el valor de numero del teclado
			numero = sc.nextInt();
			
			cont++; //Aumento cont por cada iteración del bucle	
		}
		
		//Después de termianr el bucle muestro el resultado de la media
		System.out.println("El resultado de la media es: " + suma/cont);
		
		//Cierro el Scanner
		sc.close();
	}

}
