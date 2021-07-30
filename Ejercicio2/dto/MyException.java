package Ejercicio2.dto;

@SuppressWarnings("serial")
public class MyException extends Exception{

	// Atributos
	int num;
	
	// Constructore	
	public MyException(int num) {
		super();
		this.num = num;
	}

	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	// Metodos
	@Override
	public String getMessage() {
		String error = "";
		
		if (getNum() == 1) {
			error = "El numero esta entre 1 i 10";
		}
		else if (getNum() == 2){
			error = "El numero no esta entre 1 i 10";
		}
		return error;
	}
}
