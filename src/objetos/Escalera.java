package objetos;

import java.awt.Graphics;

import graficos.Assets;
import matematica.Vector2D;

public class Escalera extends GameObject{

	public Escalera(String tipo, Vector2D posicion) {
		super(tipo, posicion);
	}

	@Override
	public void actualizar() {
	
		
	}

	@Override
	public void dibujar(Graphics g) {
		g.drawImage(Assets.escalera, (int)posicion.getX(),(int)posicion.getY(), null);
		
	}

}
