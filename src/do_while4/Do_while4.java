package do_while4;

import java.util.Scanner;

public class Do_while4 {
	public static void main(String[] args) {
		
		//Declaro las variables donde haré un contador y guardaré el número introducido por el usuario
		int cont = 0, num;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Muestro el mensaje por pantalla con las instrucciones del programa
		System.out.println("Introduzca un número para mostrar su tabla de multiplicar: ");
		
		//Leo el valor de num del teclado
		num = sc.nextInt();
		
		/*Creo un bucle con do while en el que mostraré la tabla de multiplicar del número introducido 
		 *por el usuario y lo multiplico con un contador que aumentará con cada iteración del bucle, y este se
		 *repetirá mientras el contador valga 10 o menos*/
		do {
			System.out.println(num + " x " + cont + " = " + num*cont);
			
			cont++;
		}while(cont <= 10);
		
		//Cierro el Scanner
		sc.close();
	}

}
