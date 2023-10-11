package while1;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		int suma = 0;
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un valor positivo para sumarlo, si quiere dejar de sumar introduzca un valor negativo");
		
		numero = sc.nextInt();
		
		while (numero >= 0) {
			suma += numero;
			System.out.println("Introduzca un valor positivo para sumarlo, si quiere dejar de sumar introduzca un valor negativo");
			numero = sc.nextInt();
		}
		
		System.out.println("El resultado de la suma es: " + suma);
		sc.close();
	}

}
