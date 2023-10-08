package Ej5;

import java.util.Scanner;

public class Ejercicio5App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-- DECIMAL A BINARIO --");
				
		System.out.print("Introduce un numero decimal y se hara la conversion a binario: ");
		String numeroString = sc.nextLine();
		
		try {
			int numero = Integer.parseInt(numeroString);
			if (numero>0) {
				String resultado = convertirBinario(numero);
				System.out.println("El numero "+numero+ " convertido a binario es -> "+resultado);
			} else {
				System.out.println("\n -> Introduce un numero entero POSITIVO  !!");

			}
		} catch (Exception e) {
			System.out.println("\n -> Introduce un numero valido !!");
		}
		
		sc.close();
		

	}

	public static String convertirBinario(int numero) {
		int binario = 0;
		String resultado = "";
		String resultadoFinal = "";

		/*Al salir de este bucle obtengo el numero binario al reves, 
		 * porque cada vez que se ejecuta el bucle hace la division y obtiene el resto
		 * y el numero binario es el resto pero se lee al reves*/
		
		while (numero!=0) {
			binario = numero%2;
			numero = numero/2;
			resultado = resultado + Integer.toString(binario);

		}
		
		/*Lo comento porque nose si es la manera correcta de hacerlo pero yo lo he hecho asi,
		 * despues de obtener el binario al reves, le doy la vuelta con este bucle*/
		
		for (int i = resultado.length() - 1; i >= 0; i--) {
			resultadoFinal = resultadoFinal + resultado.charAt(i);
		}
		
		return resultadoFinal;
		
	}

}
