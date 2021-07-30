package Ejercicio5;

import java.util.Random;
import java.util.Scanner;

import Ejercicio5.dto.Password;

public class ejercicio5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int TAMA�O = 10;
		Scanner scn = new Scanner(System.in);
		Password[] pw = new Password[TAMA�O];
		boolean[] fuerte = new boolean[TAMA�O];
		int i;
		
		// Para generar contrase�as
		for(i = 0; i < pw.length; i++) {
			System.out.println("Di el tama�o del la password numero " + (i+1)); // Pedimos la longitud
			pw[i] = new Password(scn.nextInt()); // La generamos
			fuerte[i] = pw[i].esFuerte(); // Guardamos si es fuerte o no
		}
		
		// Para mostrar todo
		for(i = 0; i < pw.length; i++) {
			System.out.println("Contrase�a " + (i + 1) + ": " + pw[i].getContrase�a() + " " + fuerte[i]);
		}
		
		scn.close();
	}

}
