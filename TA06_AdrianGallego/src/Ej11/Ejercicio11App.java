package Ej11;

import java.util.Scanner;

public class Ejercicio11App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el tamaño para crear un array");
		
		System.out.print("Tamaño del array: ");
		String tamanoString = sc.nextLine();
		int tamano = Integer.parseInt(tamanoString);
		
		int array1 [] = new int [tamano];
		int array2 [] = new int [tamano];

		array1 = rellenarArray(array1);
		array2 = array1;
		
		int[] arrayMultiplicado = multiplicarArrays(array1,array2);
		
		mostrarArrays(array1,array2,arrayMultiplicado);
	}
	
	private static void mostrarArrays(int[] array1, int[] array2, int[] arrayMultiplicado) {
		System.out.println("Array1:");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]+ " ");
		}
		
		System.out.println("\nArray2:");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]+ " ");
		}
		
		System.out.println("\nArrayMultiplicado:");
		for (int i = 0; i < arrayMultiplicado.length; i++) {
			System.out.print(arrayMultiplicado[i]+ " ");
		}
		
	}

	public static int[] multiplicarArrays(int[] array1, int[] array2) {
		int tamano = array1.length;
		int[] resultado = new int[tamano];
		
		for (int i = 0; i < array1.length; i++) {
			resultado[i] = array1[i] * array2[i];
		}
		return resultado;
		
	}

	public static int[] rellenarArray(int[] array1) {
		for (int i = 0; i < array1.length; i++) {
			double random = Math.random() * (10 - 1 + 1) + 1;
			int numRandom = (int)Math.floor(random);
			array1[i] = numRandom;
		}
		return array1;
		
	}

}
