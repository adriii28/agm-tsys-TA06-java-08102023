package Ej2;

import javax.swing.JOptionPane;

public class Ejercicio2App {

	public static void main(String[] args) {
		
		String rangoMinString = JOptionPane.showInputDialog("Numero minimo para generar");
		String rangoMaxString = JOptionPane.showInputDialog("Numero maximo para generar");
		
		int rangoMin = Integer.parseInt(rangoMinString);
		int rangoMax = Integer.parseInt(rangoMaxString);
		
		double numeroFinal = generarNumeros(rangoMax,rangoMin);
		System.out.println(numeroFinal);

	
	}
	
	public static double generarNumeros(int rangoMax, int rangoMin) {
		//Genera un numero random con el rango pasado por el usuario
		double numRandom = Math.random() * (rangoMax - rangoMin + 1) + rangoMin;
		//Quita los decimales
		numRandom = Math.floor(numRandom);
		return numRandom;
	
	}

}
