package do_while2;

import java.util.Scanner;

public class Do_while2 {
	public static void main(String[] args) {
		
		/*Declaro las variables donde guardo el número que incremento y divido entre 2 para comprobar 
		 *si son pares y la variable donde hago la divivsión*/
		int num = 1, div;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Muestro un mensaje antes del bucle para no repetirlo
		System.out.println("Los números pares entre 1 y 200 son: ");
		
		/*Creo un bucle con do while donde divido num entre 2 y me quedo con el resto para comprobar si 
		 *el resultado es 0, si lo es muestro por pantalla solo los números pares*/
		do {
			div = num % 2;
			if (div == 0 && num < 200) {
				System.out.println(num + ", ");
			} else if (div == 0 && num == 200){
				System.out.println(num + ".");
			}
			num++;
		}while(num <= 200);
		
		//Cierro el Scanner
		sc.close();
	}

}
