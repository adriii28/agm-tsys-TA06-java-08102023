package Ej3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio3App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-- ES PRIMO? --");
		System.out.print("Introduce un numero y te indicare si es un numero primo o no: ");
		String numString = sc.nextLine();
		
		try {
			int num = Integer.parseInt(numString);
			boolean esPrimo = esNumPrimo(num);
			System.out.println(esPrimo);
		} catch (Exception e) {
			System.out.println("\n -> Introduce un numero valido!!");
		}
		
	}
	
	public static boolean esNumPrimo(int num) {
		boolean primo = true;
		if (num<=1) {
			primo = false;
		}
		
		for (int i = 2; i * i <= num; i++) {
			if (num%i==0) {
				primo = false;
			}
		}
		return primo;
	}

}
