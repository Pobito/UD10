package Ejercicio5.dto;

import java.util.Random;

public class Password {
	
	// Atributos
	private int longitud;
	private String contrase�a;

	public Password () {
		this.longitud = 11;
		this.contrase�a = generarPassword();
	}
	public Password (int longitud) {
		this.longitud = longitud;
		this.contrase�a = generarPassword();
	}

	// Metodos
	private String generarPassword() {
		Random rnd = new Random();
		String contrase�a = "";
		int i;
		
		for (i = 0; i < getLongitud(); i++) {
			// True o false para generar numeros o caracteres (true caracteres, false nums)
			if (rnd.nextBoolean()) {
				// Para las mayusculas o minusculas (true mayusc, false minus)
				if (rnd.nextBoolean()) {
					contrase�a += (char) ((int) (rnd.nextDouble() * 26 + 65));
				}
				else {
					contrase�a += (char) ((int) (rnd.nextDouble() * 26 + 97));
				}
			}
			// Genera numeros del 48 al 57, los equivalentes ascii a los numeros del 0 al 10
			else {
				contrase�a += (char) ((int) (rnd.nextDouble() * 10 +48));
			}
		}
		return contrase�a;
	}
	
	// Para saver si es fuerte o no
	public boolean esFuerte() {
		boolean fuerte = false;
		int nums = 0, mayus = 0, minus = 0, i;
		char caracter;
		// Bucle para todos los caracteres
		for (i = 0; i < getLongitud(); i++) {
			caracter = getContrase�a().substring(i, i+1).charAt(0); // Guardamos el valor de cada uno de los caracteres
			// Comparamos si es un numero, una mayus o una minus (con su codigo ascii)
			if (((int) caracter) >= 48 && ((int) caracter) <= 57) {
				nums++;
			}
			if (((int) caracter) >= 65 && ((int) caracter) <= 90) {
				mayus++;
			}
			if (((int) caracter) >= 97 && ((int) caracter) <= 122) {
				minus++;
			}
		}
		if (mayus > 2 && minus > 1 && nums > 5) {
			fuerte = true;
		}
		
		return fuerte;
	}
	
	
	// Getters setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	
}
