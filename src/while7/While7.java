package while7;

import java.util.Scanner;

public class While7 {
	public static void main(String[] args) {
		
		int num, random;
		
		Scanner sc = new Scanner(System.in);
		
		random = (int) ((int) 1 + Math.random() * ((100 - 1) + 1));
		
		System.out.println("Introduzca un número entre el 1 y el 100, si se quiere rendir introduzca -1: ");
		
		num = sc.nextInt();
		
		if (num < 100) {
			while (num != random) {
				if (num == -1){
					System.out.println("Vaya, te rindes? Había pensado en el número: " + random);
					break;
				} else if (num == 0){
					System.out.println("El valor introducido es erróneo");
					break;
				} else if (num < random){
					System.out.println("El número es mayor");
					System.out.println("Si se rinde introduzca -1");
					num = sc.nextInt();
					if (num == -1) {
						System.out.println("Vaya, te rindes? Había pensado en el número: " + random);
						break;
					}
				} else if (num > random){
					System.out.println("El número es menor");
					System.out.println("Si se rinde introduzca -1");
					if (num == -1) {
						System.out.println("Vaya, te rindes? Había pensado en el número: " + random);
						break;
					}
					num = sc.nextInt();
				}
			};
		if (num == random) {
			System.out.println("Acertaste!!");
		}
		}
		
		sc.close();
	}

}
