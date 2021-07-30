package Ejercicio3.dto;

import java.util.Random;

public class Ordenador {

	private int num;
	
	// Constructor
	public Ordenador () {
		this.num = generarRandom();
	}
	
	// Getters setters
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	// Metodos
	// Para generar un random
	public int generarRandom() {
		System.out.println("Generando número aleatorio...");
		Random rnd = new Random();
		return (int) (rnd.nextDouble()*999+1);
	}
	
	public void comprovarNum() {
		System.out.println("El numero generado es: " + getNum());
		try {
			if (getNum() % 2 == 0) { throw new MiExcepcion(1);}
			else {throw new MiExcepcion(2);}
		} catch (MiExcepcion e) {
			System.out.println(e.getMessage());
		}
		
	}
}
