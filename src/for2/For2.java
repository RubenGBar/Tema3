package for2;

public class For2 {
	public static void main(String[] args) {
		
		//Muestro un mensaje por pantalla de lo que va a ocurrir
		System.out.println("Los números pares del 1 al 200 son: ");
		
		/*Creo un bcule for donde declaro una variable para usarla como un contaodor, el bucle iterará hasta que 
		 *este sea 200 e irá aumentando de 2 en 2. Lo que hará el programa es mostrar los números pares entre 1 y 200*/
		for (int i = 0; i <= 200; i += 2) {
			
			if (i == 0) {
				
			} else {
				System.out.println(i);
			}
			
		}
	}

}
