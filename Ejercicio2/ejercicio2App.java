package Ejercicio2;

import Ejercicio2.dto.MyException;

public class ejercicio2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int num = 200;
			if (num >= 0 && num <=10 ) { throw new MyException(1);}
			else {throw new MyException(2);}
			
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
