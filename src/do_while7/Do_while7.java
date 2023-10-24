package do_while7;

import java.util.Scanner;

public class Do_while7 {
	public static void main(String[] args) {
		//Declaro la variable de los números a sumar, restar, multiplicar o dividir
		double num1, num2;
		
		//Declaro una variable donde almaceno la elección del usuario
		String elegir;
		
		//Creo el Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Creo el bucle donde pido los dos números y la opción del menú hasta que introduzca E
		do {
		//Le pido que introduzca un número
		System.out.println("Introduzca el primer número: ");
		
		//Leo el valor de num1 del teclado
		num1 = sc.nextDouble();
		
		//Le pido que introduzca un número
		System.out.println("Introduzca el segundo número: ");
		
		//Leo el valor de num2 del teclado
		num2 = sc.nextDouble();
		
		//Muestro el menú por pantalla
		System.out.println("A. SUMAR LOS NÚMEROS"
				+ "\nB. RESTAR LOS NÚMEROS"
				+ "\nC. MULTIPLICAR LOS NÚMEROS"
				+ "\nD. DIVIDIR LOS NÚMEROS"
				+ "\nE. SALIR");
		
		//Hago que deje de leer para que al leer del teclado no salte a la próxima lectura de teclado
		sc.nextLine();
		
		//Leo el valor de elegir del teclado
		elegir = sc.nextLine();
		} while (!elegir.equals("E"));
		
		//Muestro el resultado de la operación por pantalla
		System.out.print("El resultado es: " );
		
		switch (elegir) {//Creo el Switch para hacer las distintas operaciones según lo elegido por el usuario
		case "A" -> {//Si se ha elegido A se suman los números
			System.out.println(num1+num2);
		}
		case "B" -> {//Si se ha elegido B se restan los números
			System.out.println(num1-num2);
		}
		case "C" -> {//Si se ha elegido C se multiplican los números
			System.out.println(num1*num2);
		}
		case "D" -> {//Si se ha elegido D se dividen los números, solo si es distinto de cero y si es cero da error
			
			//Creo un condicional para comprobar que el número no sea cero
			if (num2 != 0) {//Si num2 es distinto de cero los números se dividen
				System.out.println(num1/num2);
			}else {//Si num2 es cero da un mensaje de error y explica que no se puede dividir entre cero
				System.out.println("ERROR, no se puede dividir entre cero");
			}
		}
		case "E" -> {
			System.out.println("El programa ha terminado");
		}
		default -> {//Si se ha elegido otro valor se da un mensaje de error
			System.out.println("El valor introducido es incorrecto");
		}
		}
		//Cierro el Scanner
		sc.close();
	}

}
