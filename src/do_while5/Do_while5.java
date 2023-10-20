package do_while5;

import java.util.Random;
import java.util.Scanner;

public class Do_while5 {
	public static void main(String[] args) {
		
		/*Declaro las variables donde guardo el numero generado por la máquina y el mínimo y el máximo de este*/
		int random, min = 1, max = 101;
		
		//Declaro la variable donde guardo la respuesta del usuario
		String respuesta;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creo el objeto para generar el número aleatorio de la máquina
		Random rand = new Random();
		
		/*Creo el bucle, que se ejecutará mientras el número de la máquina no sea igual al pensado y 
		 *el número mínimo o máximo no sean iguales, en el que generaré el número aleatorio, 
		 *explico las instrucciones del juego al usuario y cambio el mínimo y el máximo del número aleatorio 
		 *generado por la máquina según las entradas del usuario*/
		do {
			random = rand.nextInt(min , max);
			
			System.out.println("He pensado en el número: " + random + " ¿He acertado?"
					+ "\n(Para jugar introduzca: MAYOR, MENOR o IGUAL)");
			
			respuesta = sc.nextLine();
			
			if (respuesta.equals("MAYOR")) {
				min = random + 1;
			}else if (respuesta.equals("MENOR")) {
				max = random;
			}
			
		}while (!respuesta.equals("IGUAL") && min != max);
		
		/*Si el límite máximo y mínimo coninciden imprimo un mensaje en el que la máquina piensa que la están troleando
		 *y si no uno en el que simplente se alegra por ganar*/
		if (min == max) {
		System.out.println("¿Me estás engañando o te has equivocado? "
				+ "\nEn cualquier caso, gané");
		} else {
			System.out.println("Acerté ^^");
		}
		
		//Ciero el Scanner
		sc.close();
	}

}
