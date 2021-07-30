package Ejercicio1.dto;

import java.util.Random;

public class Ordenador {

	// Atributos
	int num;
	
	public Ordenador () {
		this.num = generarNumero(); // En el propio constructor generamos el numero random
	}
	
	
	// Metodos
	// Para generar un random
	public int generarNumero() {
		Random rnd = new Random();
		return (int) (rnd.nextDouble()*500 + 1);
	}
	// Para decir si es mas grande o mas pequeño
	public String mayorOMenor (int Num) {
		// Si su num es mas grande
		if (Num > getNum()) {
			return "Tu numero es mas grande";
		}
		// Si su num es mas peque
		else if (Num < getNum()) {
			return "Tu numero es mas pequeño";
		}
		// Si son iguales
		else {
			return "Numero correcto";
		}
	}
	// Para comprovar si el numero que le pasas es igual al que se ha generado random
	public boolean comprovarNum(int Num) {
		if (Num == getNum()) {
			return true;
		}
		else {
			return false;
		}
	}

	// Getters setters
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "Ordenador [num=" + num + "]";
	}
}
