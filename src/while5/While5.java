package while5;

import java.util.Scanner;

public class While5 {
	public static void main(String[] args) {
		
		/*Declaro las variables para almacenar el valor del contador principal, el número que
		 * le pido al usuario, la suma de los números positivos, el contador de ceros, la suma de
		 * los números negativos y el contador de los números negativos para saber entre cuanto lo
		 * tengo que dividir */
		int contandor = 0, numero, sumaPos = 0, contadorCeros = 0, contadorNeg = 0, sumaNeg = 0;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creo el bucle donde le pido los 10 números a introducir
		while (contandor < 10) {
			//Le pido que introduzca un número
			System.out.println("Introduzca un número, pulsa intro para introducir el siguiente");
			
			//Leo el valor de numero del teclado
			numero = sc.nextInt();

			/*Creo el condicional para clasificar los números y hacer distintas operaciones según 
			 * el signo del número*/
			if (numero > 0) {//Si el número es positivo los voy sumando
				sumaPos += numero;
			} else if (numero < 0) {/*Si el número es negativo los sumo e incremento el contador para 
									saber entre cuanto dividir*/
				sumaNeg += numero;
				contadorNeg++;
			} else {//Si el número es 0 aumento un contador para contar cuantos ceros ha introducido
				contadorCeros++;
			}
			
			//Aumento el contador por cad iteración del bucle y que cuando sea mayor que 10 termine
			contandor++;
		}
		
		//Creo un condicional para comprobar si contadorNeg es cero
		if (contadorNeg == 0) {/*Si contadorNeg es cero muestro por pantalla que no se ha introducido 
								ningún número negativo*/
			System.out.println("No se ha introducido ningún número negativo");
		}else {//Si contadorNeg es distinto de cero calculo la media de los números negativos
			System.out.println("La media de los números negativos es: " + sumaNeg/contadorNeg);
		}
		
		/*Muestro por pantalla la suma de los positivos, la media de los negativos y 
		 * el número de ceros introducidos*/
		System.out.println("La suma de los números positivos introducidos es: " + sumaPos
				+ " \nEl número de ceros introducidos es: " + contadorCeros);
		
		//Cierro el Scanner
		sc.close();
	}

}
