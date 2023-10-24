package dowhile8;

import java.util.Scanner;

public class Dowhile8 {
	public static void main(String[] args) {
		//Declaro las variables donde almacenaré el valor las tiradas
		 String tirada1, tirada2;
		 
		 //Declaro las variables donde guardo el número que se le asignará a cada tirada y las inicializo para después poder sumarlas
		 int tirada1_num1 = 0, tirada2_num2 = 0;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creo un bucle donde pìdo la tirada del dao hasta que introduzca UNO, DOS, TRES, CUATRO, CINCO o SEIS
		do {
		//Le pido al usuario que introduzca el valor de la primera tirada
		System.out.println("Introduzca el valor de su primera tirada: ");
		
		//Leo el valor de tirada1 del teclado
		tirada1 = sc.nextLine();
		} while(!tirada1.equals("UNO") && !tirada1.equals("DOS") && !tirada1.equals("TRES") 
				&& !tirada1.equals("CUATRO") && !tirada1.equals("CINCO") && !tirada1.equals("SEIS"));
		//Creo el switch para asignar un valor númerico a las tiradas
		switch (tirada1) {
		case "UNO" -> {//Si se introduce UNO le asigno el valor númerico 1 a una nueva variable
			tirada1_num1 = 1;
		}
		case "DOS" -> {//Si se introduce DOS le asigno el valor númerico 2 a una nueva variable
			tirada1_num1 = 2;
		}
		case "TRES" -> {//Si se introduce TRES le asigno el valor númerico 3 a una nueva variable
			tirada1_num1 = 3;
		}
		case "CUATRO" -> {//Si se introduce CUATRO le asigno el valor númerico 4 a una nueva variable
			tirada1_num1 = 4;
		}
		case "CINCO" -> {//Si se introduce CINCO le asigno el valor númerico 5 a una nueva variable
			tirada1_num1 = 5;
		}
		case "SEIS" -> {//Si se introduce SEIS le asigno el valor númerico 6 a una nueva variable
			tirada1_num1 = 6;
		}
		}
		
		//Creo un bucle donde pìdo la tirada del dao hasta que introduzca UNO, DOS, TRES, CUATRO, CINCO o SEIS
		do {
		//Le pido al usuario que introduzca el valor de la segunda tirada
		System.out.println("Introduzca el valor de su segunda tirada: ");
		
		//Leo el valor de tirada2 del teclado
		tirada2 = sc.nextLine();
		} while(!tirada2.equals("UNO") && !tirada2.equals("DOS") && !tirada2.equals("TRES") 
				&& !tirada2.equals("CUATRO") && !tirada2.equals("CINCO") && !tirada2.equals("SEIS"));
		
		//Creo el switch para asignar un valor númerico a las tiradas
		switch (tirada2) {
		case "UNO" -> {//Si se introduce UNO le asigno el valor númerico 1 a una nueva variable
			tirada2_num2 = 1;
		}
		case "DOS" -> {//Si se introduce DOS le asigno el valor númerico 2 a una nueva variable
			tirada2_num2 = 2;
		}
		case "TRES" -> {//Si se introduce TRES le asigno el valor númerico 3 a una nueva variable
			tirada2_num2 = 3;
		}
		case "CUATRO" -> {//Si se introduce CUATRO le asigno el valor númerico 4 a una nueva variable
			tirada2_num2 = 4;
		}
		case "CINCO" -> {//Si se introduce CINCO le asigno el valor númerico 5 a una nueva variable
			tirada2_num2 = 5;
		}
		case "SEIS" -> {//Si se introduce SEIS le asigno el valor númerico 6 a una nueva variable
			tirada2_num2 = 6;
		}
		}
		
		//Sumo el resultado de las tiradas y lo muestro por pantalla
		System.out.println("La suma de sus tiradas es: " + (tirada1_num1+tirada2_num2));
		
		//Cierro el Scanner
		sc.close();
	}

}
