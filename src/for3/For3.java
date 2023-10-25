package for3;

public class For3 {
	public static void main(String[] args) {
		
		//Muestro un mensaje por pantalla de lo que va a hacer el programa
		System.out.println("Estos son los múltilos de 7 hasta el 100: ");
		
		/*Creo un bucle donde declaro una variable que usaré como contador que aumentará de 1 en 1 y 
		 *el bcule iterará hasta que este sea igual o menor que 100. Lo que haré en el bucle es mostrar
		 *los números múltiplos de 7*/
		for (int i = 0; i <= 100; i++) {
			
			if (i %7 == 0) System.out.println(i);
			
		}
		
	}

}
