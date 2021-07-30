package Ejercicio1;

import javax.swing.JOptionPane;
import Ejercicio1.dto.Ordenador;

public class Ejercicio1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ordenador orde = new Ordenador();
		int num = -1, cont = 0;

		// Bucle para pedir un numero hasta que lo acierte
		do {
			// Para comprovar si pone un num o no
			try {
				num = Integer.parseInt(JOptionPane.showInputDialog("Di un numero"));
				System.out.println(orde.mayorOMenor(num)); // Comprovamos si es mayor o menor
				cont++;
			} catch (NumberFormatException e) { // Si no pone un num...
				System.out.println("No has introducido un numero");
			}
			
		} while (!orde.comprovarNum(num)); // Mientras que no sean iguales
		
		System.out.println("El numeor total de intentos es " + cont);
	}

}
