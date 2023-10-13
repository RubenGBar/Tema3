package while6;

import java.util.Scanner;

public class While6 {
	public static void main(String[] args) {
		
		/*Declaro las variables donde recojo la edad de los alumnos, todas las edades sumadas, el número de iteraciones del bucle para
		 * calcular la media de las edades y una varible que incremento si los alumnos son mayores de edad*/
		int edad, sumaEdad = 0, mediaEdad = 0, mayoriaEdad = 0;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido que introduzca la edad de un alumno y le indico como terminar el programa
		System.out.println("Introduzca la edad de un alumno, si quiere terminar introduzca "
				+ "un número negativo");
		
		//Leo el valor de edad del teclado
		edad = sc.nextInt();
		
		//Creo un loop donde vuelvo a pedir la edad de los alumnos hasta que este se cumpla la condición y termine
		while (edad >= 0) {
			
			//Le pido que introduzca la edad de un alumno y le indico como terminar el programa
			System.out.println("Introduzca la edad de un alumno, si quiere terminar introduzca "
					+ "un número negativo");
			
			//Leo el valor de edad del teclado
			edad = sc.nextInt();
			
			//Compruebo si edad es mayor que 18
			if (edad >= 18) {//Si lo es incremento la variable mayoriaEdad en uno
				mayoriaEdad++;
			}
			
			//Hago que cada edad introducida se vaya sumando
			sumaEdad += edad;
			
			//Incremento en 1 el valor de la variable mediaEdad para calcular la edad media de todos los alumnos
			mediaEdad++;
		}
		
		//Creo un condicional para comprobar que el valor de la variable edadMedia es dsitinto de cero
		if (mediaEdad == 0) {//Si el valor de mediaEdad es cero imprimo por pantalla que la edad media es de cero
			System.out.println("La media de las edades es: 0");
		}else {//Si el valor de mediaEdad calculo la edad media de todos los alumnos
			System.out.println("La media de las edades es: " + sumaEdad/mediaEdad);
		}
		
		//Muestro por pantalla la suma de las edades, el número de alumnos y cuántos son mayores de edad
		System.out.println("La suma de las edades es: " + sumaEdad 
				+ "\nEl número de alumnos es: " + mediaEdad
				+ "\nLa cantidad de alumnos que son mayores de edad es de " + mayoriaEdad);
		
		//Cierro el Scanner
		sc.close();
	}

}
