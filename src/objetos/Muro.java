package objetos;

import java.awt.Graphics;

import graficos.Assets;
import matematica.Vector2D;

public class Muro extends GameObject{
	
	

	public Muro(String tipo, Vector2D posicion) {
		super(tipo, posicion);
		
	}

	@Override
	public void actualizar() {
		
		
	}

	@Override
	public void dibujar(Graphics g) {
		g.drawImage(Assets.muro, (int)posicion.getX(),(int)posicion.getY(), null);
	}

}
