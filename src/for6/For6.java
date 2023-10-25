package for6;

public class For6 {
	public static void main(String[] args) {
		
		/*Declaro las variables donde sumo los números y creo un contador para los números impares*/
		int sumaImpar = 0, numeroImpar = 1;
		
		/*Creo un bucle donde declaro una variable para usarala como contador que aumentará en 1 y 
		 *el bucle iterará hasta que sea menor o igual que 10. Dentro del bucle sumaré los números impares, 
		 *que los conseguiré sumandole 2 a la variable numeroImpar en cada iteración del bucle*/
		for (int i = 1; i <= 10; i += 1) {
			sumaImpar += numeroImpar;
			numeroImpar += 2;
		}
		
		//Muestro por pantalla la suma de los 10 primeros números impares
		System.out.println("La suma de los 10 primeros números impares es:\n" + sumaImpar);
	}

}
