package main;

import vista.VistaJuego;

public class Main {

	public static void main(String[] args) {
		VistaJuego miVistaJuego=new VistaJuego();
		miVistaJuego.setVisible(true);
		miVistaJuego.iniciarHilo();
	}

}
