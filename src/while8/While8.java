package while8;

import java.util.Scanner;

public class While8 {
	public static void main(String[] args) {
		
		int arbolIntroducido, arbolGuardar = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la altura de un árbol en centímetros y sin decimales, si "
				+ "quiere terminar introduzca -1: ");
		
		arbolIntroducido = sc.nextInt();
		
		while (arbolIntroducido > -1) {
			
			if (arbolIntroducido > arbolGuardar) {
				arbolGuardar = arbolIntroducido;
			}
			
		}
		
		sc.close();
	}

}
