package while4;

import java.util.Scanner;

public class While4 {
	public static void main(String[] args) {
		
		//Declaro las variablos donde almaceno los números a comprobar si son pares o impares
		int numero;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido al usuario que introduzca un número y le digo lo que ocurre si introduce 0
		System.out.println("Introduzca un número, si es 0 el programa terminará");
		
		//Leo el valor de numero del teclado
		numero = sc.nextInt();
		
		//Creo el condicional para comprobar si el número es par o impar
		if (numero == 0) {//Si es cero muestra que es par y termina el programa (no puedo utilizar break porqu no estoy en un while o switch)
			System.out.println("El número es par");
			System.exit(0);
		}else if (numero%2 == 0) {//Si se cumple la condición muestra que el número es par
			System.out.println("El número es par");
		}else {//En el resto de casos muestra que es impar
			System.out.println("El número es impar");
		}
		
		//Cre el bucle para que el usuario pueda seguir introduciendo números hasta que introduzca cero
		while (numero != 0) {
			//Le pido al usuario que introduzca un número y le digo lo que ocurre si introduce 0
			System.out.println("Introduzca un número, si es 0 el programa terminará");
			
			//Leo el valor de numero del teclado
			numero = sc.nextInt();
			
			//Creo el condicional para comprobar si el número es par o impar
			if (numero == 0) {//Si es cero muestra que es par y termina el programa
				System.out.println("El número es par");
			}else if (numero%2 == 0) {//Si se cumple la condición muestra que el número es par
				System.out.println("El número es par");
			}else {//En el resto de casos muestra que es impar
				System.out.println("El número es impar");
			}
		}
		//Cierro el Scanner
		sc.close();
	}

}
