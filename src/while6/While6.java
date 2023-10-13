package while6;

import java.util.Scanner;

public class While6 {
	public static void main(String[] args) {
		
		int edad, sumaEdad = 0, mediaEdad = 0, mayoriaEdad = 0;
		
		Scanner sc = new Scanner(System.in);
			
		while (edad > 0) {
			System.out.println("Introduzca la edad de un alumno, si quiere terminar introduzca "
					+ "un número negativo");
			
			edad = sc.nextInt();
			
			if (edad >= 18) {
				mayoriaEdad++;
			}
			
			sumaEdad += edad;
			mediaEdad++;
		}
		
		System.out.println("La suma de las edades es: " + sumaEdad 
				+ "\nLa media de las edades es " + sumaEdad/mediaEdad 
				+ "\nEl número de alumnos es de " + mediaEdad
				+ "\nLa cantidad de alumnos que son mayores de edad es de " + mayoriaEdad);
		
		sc.close();
	}

}
