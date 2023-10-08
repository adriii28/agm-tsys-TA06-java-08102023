package Ej6;

import java.util.Scanner;

public class Ejercicio6App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-- CONTADOR DE CIFRAS --");
		System.out.print("Introduce un numero entero positivo y saldra por pantalla el total de cifras de ese numero: ");
		
		String cifraString = sc.nextLine();
		sc.close();
		
		try {
			int numero = Integer.parseInt(cifraString);
			
			if (numero>0) {
				int cifraFinal = contCifras(numero);
				
				System.out.println("El numero " + numero + " tiene " + cifraFinal + " cifras");
			} else {
				System.out.println("\n -> El numero introducido tiene que ser entero positivo !!");

			}
		} catch (Exception e) {
			System.out.println("\n -> El valor introducido tiene que ser un numero entero !!");

		}
		

	}
	
	public static int contCifras(int cifra ) {
		int contCifras = 0;
		
		do {
			cifra = cifra/10;
			contCifras++;
		} while (cifra != 0);
		
		
		return contCifras;
		
	}

}
