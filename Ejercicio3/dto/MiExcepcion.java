package Ejercicio3.dto;

@SuppressWarnings("serial")
public class MiExcepcion extends Exception {

	// Atributos
	int num;

	// Constructore
	public MiExcepcion(int num) {
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
			error = "Es par";
		} else if (getNum() == 2) {
			error = "Es impar";
		}
		return error;
	}
}
