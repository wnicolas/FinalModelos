package objetos;

import java.awt.Graphics;

import graficos.Assets;
import matematica.Vector2D;

public class Roca extends GameObject {

	public Roca(String tipo, Vector2D posicion) {
		super(tipo, posicion);
		
	}

	@Override
	public void actualizar() {

		
	}

	@Override
	public void dibujar(Graphics g) {
		g.drawImage(Assets.roca, (int)posicion.getX(),(int)posicion.getY(), null);
		
	}

}
