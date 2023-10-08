package Ej4;

import javax.swing.JOptionPane;

public class Ejercicio4App {

	public static void main(String[] args) {
		String factorialString = JOptionPane.showInputDialog("Introduce un numero y se calculara el factorial");
		try {
			int factorial = Integer.parseInt(factorialString);
			int resultado = calcularFactorial(factorial);
			JOptionPane.showMessageDialog(null, "El factorial de " + factorial + " es " + resultado );
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Introduce un numero valido");
		}
	}
	
	public static int calcularFactorial(int num) {
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial *i;
		}
		return factorial;
		
	}

}
