package objetos;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import graficos.Assets;
import input.KeyBoard;
import matematica.Vector2D;
import vista.VistaJuego;

public class Player extends GameObject {

	public Player(BufferedImage textura, Vector2D posicion) {
		super(textura, posicion);
	}

	@Override
	public void actualizar() {
		if(KeyBoard.W)
			posicion.setY(posicion.getY()-5);
		if(KeyBoard.D)
			posicion.setX(posicion.getX()+5);
		if(KeyBoard.S)
			posicion.setY(posicion.getY()+5);
		if(KeyBoard.A)
			posicion.setX(posicion.getX()-5);
		if(KeyBoard.J)
			System.out.println("Salto");
		
	}

	int i=0;
	
	@Override
	public void dibujar(Graphics g) {
		i++;
		i=i%1;
		g.drawImage(Assets.rogue_idle[i],(int) posicion.getX(), (int)posicion.getY(), null);
		
	}

}
