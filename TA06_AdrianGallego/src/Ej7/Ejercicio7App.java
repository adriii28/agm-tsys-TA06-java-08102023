package Ej7;

import java.util.Scanner;

public class Ejercicio7App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-- CONVERSOR DE MONEDAS --");
		
		System.out.print("Introduce una cantidad de euros: ");
		String eurosString = sc.nextLine();
		double euros = 0;
		
		try {
			euros = Double.parseDouble(eurosString);
			if (euros>0) {
				System.out.print("A que moneda desea hacer el cambio (Dolar / Yen / Libra): ");
				String monedaCambio = sc.nextLine();
				
				sc.close();
			
				conversor(euros, monedaCambio);
			} else {
				System.out.println("\n -> El valor introducido tiene que ser un numero positivo!!");
			}

		} catch (Exception e) {
			System.out.println("\n -> El valor introducido tiene que ser un numero !!");
		}
		
		
	}
	
	public static void conversor(double euros, String monedaCambio) {
		switch (monedaCambio.toLowerCase()) {
		
		case "dolar":
			System.out.println(" -> " + euros +" euros son " + euros*1.8611 + " dolares");
			break;
			
		case "yen":
			System.out.println(" -> " + euros +" euros son " + euros*129.852 + " yenes");

			break;
			
		case "libra":
			System.out.println(" -> " + euros +" euros son " + euros*0.86 + " libras");
			break;

		default:
			System.out.println("Error, introduce la moneda de la misma manera que el enunciado");
			break;
		}
		
	}

}
