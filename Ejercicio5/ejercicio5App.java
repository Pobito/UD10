package Ejercicio5;

import java.util.Scanner;

import Ejercicio5.dto.Password;

public class ejercicio5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int TAMAÑO = 10;
		Scanner scn = new Scanner(System.in);
		Password[] pw = new Password[TAMAÑO];
		boolean[] fuerte = new boolean[TAMAÑO];
		int i;
		
		// Para generar contraseñas
		for(i = 0; i < pw.length; i++) {
			System.out.println("Di el tamaño del la password numero " + (i+1)); // Pedimos la longitud
			pw[i] = new Password(scn.nextInt()); // La generamos
			fuerte[i] = pw[i].esFuerte(); // Guardamos si es fuerte o no
		}
		
		// Para mostrar todo
		for(i = 0; i < pw.length; i++) {
			System.out.println("Contraseña " + (i + 1) + ": " + pw[i].getContraseña() + " " + fuerte[i]);
		}
		
		scn.close();
	}

}
