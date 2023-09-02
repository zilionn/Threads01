package view;

import controller.TidController;

public class Principal {

	public static void main(String[] args) {
		
		for (int x = 1 ; x < 6 ; x++) {
		Thread tidCont = new TidController(x);
		tidCont.start();
		}

	}

}
