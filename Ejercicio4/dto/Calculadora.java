package Ejercicio4.dto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
	
	Scanner teclado = new Scanner(System.in);
	
	private int num1;
	private int num2;
	
	public Calculadora () {
		boolean salir = false;
		// Bucle para asegurarnos que los numeros introducidos son correctos
		do {
			try {
				System.out.println("Di el numero 1");
				this.num1 = teclado.nextInt();
				System.out.println("Di el numero 2");
				this.num2 = teclado.nextInt();
				salir = true; // Condicion de salida, si ha llegado hasta aqui sin errores que salga
			} catch (InputMismatchException e) {
				System.out.println("Numeros mal introducidos");
				// Buffering (esta este nextLine porque sino se queda un enter en el buffer y generaria un bucle infinito
				teclado.nextLine();
			}
		} while (!salir);
	}

	// Metodos
	public void Calcular() {
		int operacion;
		boolean salir = true;
		
		do {
			System.out.println("Que operacion quieres?\n1 --> suma\n2 --> resta\n3 --> multiplicación\n4 --> potencia\n5 --> raíz "
					+ "cuadrada\n6 --> raíz cubiva\n7 --> divison");
			operacion = teclado.nextInt();
			try {
				switch (operacion) {
					case 1:
						System.out.println(Suma());
						break;
					case 2:
						System.out.println(Resta());
						break;
					case 3:
						System.out.println(Multi());
						break;
					case 4:
						System.out.println(Potencia());
						break;
					case 5:
						System.out.println("Raíz numero 1: " + Raiz2(getNum1()));
						System.out.println("Raíz numero 2: " + Raiz2(getNum2()));
						break;
					case 6:
						System.out.println("Raíz numero 1: " + Raiz3(getNum1()));
						System.out.println("Raíz numero 2: " + Raiz3(getNum2()));
						break;
					case 7:
						System.out.println(Dividir());
						break;
					default:
						System.out.println("Numero mal introducido");
						salir = false;
				}
			} catch (ArithmeticException e){
				System.out.println("Error: " +e.getMessage());
			}
		} while (!salir);
	}
	
	private int Suma () {
		return getNum1() + getNum2(); 
	}
	private int Resta () {
		return getNum1() - getNum2(); 
	}
	private int Multi () {
		return getNum1() * getNum2(); 
	}
	private double Potencia () {
		return Math.pow(getNum1(), getNum2()); 
	}
	private double Raiz2 (int num) {
		return Math.sqrt(num);
	}
	private double Raiz3 (int num) {
		return Math.cbrt(num);
	}
	private double Dividir () {
		return getNum1() / getNum2(); 
	}
	
	// Getters setters
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}

	@Override
	public String toString() {
		return "Calculadora [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
}
