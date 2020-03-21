package main;

import java.util.Scanner;

import vista.VistaJuego;

public class Main {
	

	public static void main(String[] args) {
		VistaJuego miVistaJuego=new VistaJuego();		
		miVistaJuego.iniciarHilo();
		miVistaJuego.setVisible(true);
		
	}

}
