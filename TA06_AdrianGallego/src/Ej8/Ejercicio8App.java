package Ej8;

import java.util.Scanner;

public class Ejercicio8App {

	public static void main(String[] args) {
		
		
		int arrayNum[] = new int [10];
		
		arrayNum  = pedirValores(arrayNum);
		
		System.out.println("\n");
		
		mostrarValores(arrayNum);
		
	}
	
	public static int[] pedirValores(int[] arrayNum) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" -- ARRAY -- ");
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.print("Introduce un valor para asignarle la posicion " + i + ": ");
			String numString = sc.nextLine();
			int num = Integer.parseInt(numString);
			arrayNum[i] = num;
		}
		sc.close();
		

		return arrayNum;
		
	}
	
	public static void mostrarValores(int[] arrayNum) {
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.println("Indice -> " + i + " / Valor asignado -> " +arrayNum[i]);
		}
		
	}

}
