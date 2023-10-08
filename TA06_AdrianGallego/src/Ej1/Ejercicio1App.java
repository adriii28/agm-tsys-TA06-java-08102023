package Ej1;

import javax.swing.JOptionPane;

public class Ejercicio1App {

	public static void main(String[] args) {
		
		double area = 0;

		String figura = JOptionPane.showInputDialog("Introduzca una figura para calcular su area (Circulo / Cuadrado / Triangulo)");
		
		switch (figura.toLowerCase()) {
		
		case "circulo":
			String radioString = JOptionPane.showInputDialog("Introduce el radio del circulo en cm");

			/*El try catch es para cuando el usuario introduzca un caracter que no es un numero
			 * al hacer el parse a double no de error. En caso de que el usuario 
			 * haya introducido un caracter no valido mostrara un mensaje al usuario */
			
			//Esto lo hare durante todos los ej de la TA06 en los que sea necesario controlar la entrada del usuario
			
			try {
				double radio = Double.parseDouble(radioString);
				if (radio>0) {
					area = areaCirculo(radio);
					JOptionPane.showMessageDialog(null, "El area del circulo es de " + area + " cm2");
				} else {
					JOptionPane.showMessageDialog(null, "El valor introducido debe de ser positivo");

				}
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Introduce un numero valido");

			}
			
			break;
			
		case "cuadrado":
			String ladoString = JOptionPane.showInputDialog("Introduce el lado de el cuadrado en cm");
			
			try {
				double lado = Double.parseDouble(ladoString);
				if (lado >0) {
					area = areaCuadrado(lado);
					JOptionPane.showMessageDialog(null, "El area del cuadrado es de " + area + " cm2");
				} else {
					JOptionPane.showMessageDialog(null, "El valor introducido debe de ser positivo");
				}
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Introduce un numero valido");

			}
			

			break;
			
		case "triangulo":
			String baseString = JOptionPane.showInputDialog("Introduce la base del triangulo en cm");
			String alturaString = JOptionPane.showInputDialog("Introduce la altura del triangulo en cm");
			
			try {
				double base = Double.parseDouble(baseString);
				double altura = Double.parseDouble(alturaString);
				
				if (base >0 && altura>0) {
					area = areaTriangulo(base,altura);
					JOptionPane.showMessageDialog(null, "El area del triangulo es de " + area + " cm2");
				} else {
					JOptionPane.showMessageDialog(null, "Los valores introducidos deben de ser positivos");
				}
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Introduce un numero valido");
			}
			
			

			break;
		default:
			JOptionPane.showMessageDialog(null, "Introduce una figura valida");
			break;
		}
	}
	
	public static double areaCirculo(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public static double areaCuadrado(Double lado) {
		return lado * lado;
	}
	
	public static double areaTriangulo(double base, double altura) {
		return (base * altura)/2;
	}

}
