package for8;

import java.util.Scanner;

public class For8 {
	public static void main(String[] args) {
		
		/*Declaro una variable para guardar la nota introducida y otra para guardar la nota más baja, 
		 *que inicializo en 10 para que sí o sí me guarde cualquier nota*/
		int nota, notaBaja = 10;
		
		//Creo el Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		/*Creo un bcule for donde declaro una variable para usar como contador que aumentará en 1 
		 *e iterará 5 veces. Dentro del bucle le pido que introduzca la nota y si es más baja 
		 *que la anterior la guardo*/
		for (int i = 1; i <= 5; i++) {
			
			System.out.println("Introduzca una nota: ");
			
			nota = sc.nextInt();
			
			if (nota < notaBaja) {
				notaBaja = nota;
			}
		}
		
		//Muestro la nota más baja por pantalla
		System.out.println("La nota más baja es " + notaBaja);
		
		//Cierro el Scanner
		sc.close();
	}

}
