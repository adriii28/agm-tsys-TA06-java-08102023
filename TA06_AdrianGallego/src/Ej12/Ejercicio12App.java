package Ej12;

import java.util.Scanner;

public class Ejercicio12App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numFilter=0;
		int arraySize=0;

		try {
			System.out.print("Introduce el tamaño para crear un array: ");
			String arrayString = sc.nextLine();
			arraySize = Integer.parseInt(arrayString);
			
			System.out.print("Introduce un numero y se mostraran los numeros almacenados en el array que acaben en ese digito (0 - 9): ");
			String numFilterString = sc.nextLine();
			numFilter = Integer.parseInt(numFilterString);
			
			int numeros[] = rellenarArray(arraySize);
			
			int arrayFinal[] = buscarNumero(numeros,numFilter);
			
			System.out.println("\nNumeros generados: ");
			for (int i = 0; i < numeros.length; i++) {
				System.out.print(numeros[i]+ " ");
			}
			
			System.out.println("\n\nNumeros acabados con el digito " + numFilter + ": ");
			for (int i = 0; i < arrayFinal.length; i++) {
				System.out.print(arrayFinal[i]+" ");
			}

			if (arraySize<0 || numFilter<0) {
				System.out.print(" -> Caracter invalido, introduce un numero positivo\n");

			}
			
		} catch (Exception e) {
			System.out.print(" -> Caracter invalido, introduce un numero valido\n");
		}
		
			
		sc.close();
			
		
	}
	
	public static int[] buscarNumero(int[] numeros, int numFilter) {
		int cont=0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%10 == numFilter) {
				cont++;
			}
		}
		
		int resultado[] = new int[cont];

		cont = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%10 == numFilter) {
				resultado[cont] = numeros[i];
			}
		}
		

		return resultado;
	}

	public static int[] rellenarArray(int arraySize) {
		
		int array1 [] = new int [arraySize];

		for (int i = 0; i < array1.length; i++) {
			double random = Math.random() * (300 - 1 + 1) + 1;
			int numRandom = (int)Math.floor(random);
			array1[i] = numRandom;
		}
		
		return array1;
		
	}

}
