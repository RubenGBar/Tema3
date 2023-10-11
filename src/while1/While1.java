package while1;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		
		//Declaro las variables donde sumaré los números y donde los voy a guardar
		int suma = 0, numero;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido al usuario que introduzca un número y le digo lo que ocurre si es negativo o positivo
		System.out.println("Introduzca un valor positivo para sumarlo, si quiere dejar de sumar introduzca un valor negativo");
		
		//Leo el valor de numero del teclado
		numero = sc.nextInt();
		
		//Ceo el loop para sumar los números
		while (numero >= 0) {
			
			//Sumo y asigno el valor añadido anteriormente a la variable suma
			suma += numero;
			
			//Vuelvo a pedir al usuario que introduzca un número y le explico lo que ocurre si es negativo o positivo
			System.out.println("Introduzca un valor positivo para sumarlo, si quiere dejar de sumar introduzca un valor negativo");
			
			//Leo el valor de numero del teclado
			numero = sc.nextInt();
		}
		
		//Después de termianr el bucle muestro el resultado total de la suma
		System.out.println("El resultado de la suma es: " + suma);
		
		//Cierro el Scanner
		sc.close();
	}

}
