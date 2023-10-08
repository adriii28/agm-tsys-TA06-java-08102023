package Ej10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio10App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-- GENERADOR ALEATORIO DE NUMEROS PRIMOS --");
		System.out.print("Introduce el tamaño del array: ");
		
		String medida = sc.nextLine();

		System.out.println("\nIntroduce el intervalo de numeros en el que quieres generar los numeros primos (Ej: 1-100)");
		System.out.print("Introduce el minimo: ");
		String numMinimoString = sc.nextLine();


		System.out.print("Introduce el maximo: ");
		String numMaximoString = sc.nextLine();
		
		try {
			
			int medidaArray = Integer.parseInt(medida);
			int numMinimo = Integer.parseInt(numMinimoString);
			int numMaximo = Integer.parseInt(numMaximoString);

			if (medidaArray>0 && numMinimo>0 && numMaximo>0) {
				int arrayPrimo[] = rellenarArray(medidaArray,numMinimo,numMaximo);
		        
		        imprimirMayor(arrayPrimo);
			} 
			
			
		} catch (Exception e) {
			System.out.println(" -> Error al introducir los numeros, introduce numeros enteros positivos");
		}

		sc.close();
		
        
        
	}
	
	public static void imprimirMayor(int[] arrayPrimo) {
		System.out.println("");
		
		int numMayor = 0;
		
		for (int i = 0; i < arrayPrimo.length; i++) {
			
			System.out.println("Indice " + i + " -> " + arrayPrimo[i]);
			
			if (arrayPrimo[i] > numMayor) {
				numMayor = arrayPrimo[i];
			}
		}
	
		System.out.println("\n - El mayor numero generado es -> " + numMayor);
		
	}
	
	public static int[] rellenarArray(int medidaArray, int numMinimo, int numMaximo) {
        int cont = 0;
        int[] numsPrimos = new int[medidaArray];

		 do {
				double random = Math.random() * (numMaximo - numMinimo + 1) + numMinimo;
				int numRandom = (int)Math.floor(random);
				if (esNumPrimo(numRandom)) {
					numsPrimos[cont] = numRandom;
					cont++;
				}

			} while (cont < medidaArray);
		 
		return numsPrimos;
		
	}
	
	public static boolean esNumPrimo(int num) {
		if (num<=1) {
			return false;
		}
		
		for (int i = 2; i * i <= num; i++) {
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	

}
