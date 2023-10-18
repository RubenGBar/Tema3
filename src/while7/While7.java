package while7;

import java.util.Random;
import java.util.Scanner;

public class While7 {
	public static void main(String[] args) {
		
		//Declaro las variables donde guardo el número introducido por el uuario y el número secreto
		int num, random;
		
		//Creo el Scannerr
		Scanner sc = new Scanner(System.in);
		
		//Genero el número secreto entre 1 y 100
		random = (int) ((int) 1 + Math.random() * ((100 - 1) + 1));
		
		/*Le pido que introduzca un número entre 1 y 100 para adivinar el número secreto 
		 * y que si se quiere rendir que introduzca -1*/
		System.out.println("Introduzca un número entre el 1 y el 100, si se quiere "
				+ "rendir introduzca -1: ");
		
		//Leo el valor de num del teclado
		num = sc.nextInt();
		
		//Creo un condicional para que solo me pueda introducir valores entre 100 y -1
		if (num < 100 && num >= -1) {
			while (num != random) { /*Creo una variable que iterará mientras el número 
									introducido sea distinto del secreto*/
				
				if (num == -1){/*Si introduce -1 como primer número aparece este mensaje 
								con el número secreto*/
					System.out.println("Vaya, te rindes? Había pensado en el número: " + random);
					break;
				} else if (num == 0){/*Si introduce 0 aparece este mensaje de error*/
					System.out.println("El valor introducido es erróneo");
					break;
				} else if (num < random){/*Si introduce un número menor que el secreto aparece 
										un mensaje que indica que el secreto es mayor y vuelvo a 
										leer el siguinete número que introduzca junto con la 
										opción para rendirse*/
					System.out.println("El número es mayor");
					System.out.println("Si se rinde introduzca -1");
					num = sc.nextInt();
					if (num == -1) {/*Si introduce -1 se enseña este mensaje con el mensaje secreto 
					 				y el programa termina*/
						System.out.println("Vaya, te rindes? Había pensado en el número: " + random);
						break;
					}
				} else if (num > random){/*Si introduce un número mayor que el secreto aparece 
										un mensaje que indica que el secreto es menor y vuelvo a 
										leer el siguinete número que introduzca junto con la 
										opción para rendirse*/
					System.out.println("El número es menor");
					System.out.println("Si se rinde introduzca -1");
					if (num == -1) {/*Si introduce -1 se enseña este mensaje con el mensaje secreto 
		 							y el programa termina*/
						System.out.println("Vaya, te rindes? Había pensado en el número: " + random);
						break;
					}
					//Vuelvo a leer el valor de num del teclado
					num = sc.nextInt();
				}
			};
		/*Si el número es igual al número secreto se imprime un mensaje con el 
		 * que se indica que ha acertado*/
		if (num == random) {
			System.out.println("Acertaste!!");
		}
		}//Fin del if para que solo me introduzca valores entre 100 y -1 
		else {//Si me introduce un valor que no esté entre 100 y -1 se imprime un mensaje de error
			System.out.println("El valor introducido es erróneo");
		}
		
		sc.close();
	}

}
