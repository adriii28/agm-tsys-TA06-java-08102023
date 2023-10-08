package Ej9;

import javax.swing.JOptionPane;

public class Ejercicio9App {

	public static void main(String[] args) {
		
		String medida = JOptionPane.showInputDialog("Introduce el tamaño del array");
		int medidaArray = Integer.parseInt(medida);
				
		double arrayRelleno [] = rellenarArray(medidaArray);
		
		mostrarArray(arrayRelleno);
		
	}
	
	public static double[] rellenarArray(int medidaArray) {
		final int RANGO_MAX = 9;
		final int RANGO_MIN = 0;
		double array[] = new double[medidaArray];	
		
		for (int i = 0; i < array.length; i++) {
			double numRandom = Math.random() * (RANGO_MAX - RANGO_MIN + 1) + RANGO_MIN;
			array[i] = Math.floor(numRandom);
		}
		
		return array;
		
	}
	
	public static void mostrarArray(double[] arrayRelleno) {
		double sumaArray = 0;
		for (int i = 0; i < arrayRelleno.length; i++) {
			System.out.println("En el indice " + i + " se ha guardado el numero -> " + arrayRelleno[i]);
			sumaArray += arrayRelleno[i];
		}
		System.out.println("\nLa suma de los valores es: " + sumaArray);
	}

}
