package do_while1;

import java.util.Scanner;

public class Do_while1 {
	public static void main(String[] args) {
		
		//Declaro la variable donde guardo los números a mostrar
		int num = 0;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Muestro un mensaje por pantalla antes del bucle para que no se repita
		System.out.print("Los 20 primeros números naturales son: ");
		
		/*Creo el bucle con do while que uncionará hasata que num sea menor o igual que 20 
		 * para sumarle uno a la variable num a e ir mostrando cada número por pantalla*/ 
		do {
			if (num < 20) {
				System.out.print(num + ", ");
			} else {
				System.out.println(num + ".");
			}
			num++;
		} while (num <= 20);
		
		//Cierro el Scanner
		sc.close();
	}

}
