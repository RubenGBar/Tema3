package do_while6;

import java.util.Scanner;

public class Do_while6 {
	public static void main(String[] args) {
		
		//Declaro las variables donde guardo las jugadas de los dos jugadores y otra para saber si quiere repetir el juego o no
		String jugador1, jugador2, repetir;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le digo las instrucciones del juego y explico porque uso esta terminología y sus equivalencias
		System.out.println("Vamos a jugar a Cuarzo, Pergamino, Tenaza."
				+ "\n(Es una referencia a una serie llamada Historias Corrientes)"
				+ "\nCuarzo = Piedra"
				+ "\nPergamino = Papel"
				+ "\nTenaza = Tijeras");
		
		/*Creo un primer bucle donde muestro los resultados de la partida cuando haya terminado de ejecturase el 
		 *segundo bucle y le pregunto si quiere volver a jugar, lo cual ocurrirá si introduce S*/
		do {
			/*En este bucle pido el valor de la jugada de cada jugador hasta que introduzcan CUARZO, PERGAMINO o TENAZA*/
			do {
				System.out.println("Jugador 1 introduzca su jugada. Por favor en mayúsculas: ");
				jugador1 = sc.nextLine();
				
				System.out.println("Jugador 2 introduzca su jugada. Por favor en mayúsculas: ");
				jugador2 = sc.nextLine();
			}while(!jugador1.equals("CUARZO") && !jugador1.equals("PERGAMINO") && !jugador1.equals("TENAZA") 
					&& !jugador2.equals("CUARZO") && !jugador2.equals("PERGAMINO") && !jugador2.equals("TENAZA"));
			
			if (jugador1.equals("CUARZO") && jugador2.equals("CUARZO") || 
				jugador1.equals("PERGAMINO") && jugador2.equals("PERGAMINO") || 
				jugador1.equals("TENAZA") && jugador2.equals("TENAZA")) 
			{
				System.out.println("Empate");
			} else if (jugador1.equals("CUARZO") && jugador2.equals("TENAZA") || 
					jugador1.equals("PERGAMINO") && jugador2.equals("CUARZO") || 
					jugador1.equals("TENAZA") && jugador2.equals("PERGAMINO")) 
			{
				System.out.println("El jugador1 gana");
			} else {
				System.out.println("El jugador2 gana");
			}
			
			System.out.println("¿Quieres volver a jugar?");
			repetir = sc.nextLine();
		}while (repetir.equalsIgnoreCase("S"));
		
		sc.close();
	}

}
