package do_while6;

import java.util.Scanner;

public class Do_while6 {
	public static void main(String[] args) {
		
		//
		String jugador1, jugador2, repetir;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos a jugar a Cuarzo, Pergamino, Tenaza. Por favor introduce las intstrucciones en mayúsculas."
				+ "\n(Es una referencia a una serie llamada Historias Corrientes)"
				+ "\nCuarzo = Piedra"
				+ "\nPergamino = Papel"
				+ "\nTenaza = Tijeras");
		
		do {
			do {
				System.out.println("Jugador 1 introduzca su jugada: ");
				jugador1 = sc.nextLine();
				
				System.out.println("Jugador 2 introduzca su jugada: ");
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
