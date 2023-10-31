package for9;

import java.util.Scanner;

public class For9 {
	public static void main(String[] args) {
		
		/*Declaro las variables donde guardo el número introducido y el contador del for*/
		int num, i;
		
		//Declaro una variable booleana que cambiaré a false si el número no es primo
		boolean primo = true;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creo un bucle do while para que solo me pueda introducir números positivos
		do {
			//Muestro un mensaje por pantalla con las instrucciones del programa
			System.out.println("Introduzca un número positivo para comprobar si es primo o no: ");
			
			//Leo el valor de num del teclado
			num = sc.nextInt();
		}while (num < 1);
		
		//Si el número introducido es 1 muestro que no es primo, sino sigo con la función
		if (num == 1) {
			System.out.println("El número no es primo");
		}else {
			
		/*Creo un bucle for que se ejecutará donde incializo el contador en 2 e iterará mientras el contador
		*sea mayor que el número introducido. Dentro del bucle cambiaré la variable primo a falso si el 
		*número introducido tiene múltiplos además de si mismo y eso lo haré dividiendo el número entre 
		*el contador y ver si el resto es cero*/
		
		for (i = 2; i < num; i++) {
					if (num%i == 0) {
						primo = false;
						break;
				}
			}
		
		/*Si el número introducido es primo muestro por pantalla que es primo, sino muestro que no lo es*/
		if (primo == true) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
		}
		//Cierro el Scanner
		sc.close();
	}

}
