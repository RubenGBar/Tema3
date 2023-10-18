package do_while4;

import java.util.Scanner;

public class Do_while4 {
	public static void main(String[] args) {
		
		int cont = 0, num, suma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número para mostrar su tabla de multiplicar: ");
		
		num = sc.nextInt();
		
		do {
			System.out.println(num + " x " + cont + " = " + num*cont);
			
			cont++;
		}while(cont <= 10);
		
		sc.close();
	}

}
