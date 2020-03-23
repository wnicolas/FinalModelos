package objetos;

import java.awt.Graphics;

import graficos.Assets;
import matematica.Vector2D;

public class Ascensor extends GameObject{
	
	boolean arriba=true;
	boolean abajo=false;
	boolean activo=false;

	public Ascensor(String tipo, Vector2D posicion) {
		super(tipo, posicion);
	}

	@Override
	public void actualizar() {
	
		if(activo) {
			if(arriba) {
				bajar();
				if(posicion.getY()==460) {
					arriba=false;
				}
			}

		}
				
	}
	@Override
	public void dibujar(Graphics g) {
		g.drawImage(Assets.ascensor, (int)posicion.getX(),(int)posicion.getY(), null);
		
	}
	
	public void subir() {
		posicion.setY(posicion.getY()-5);
	}
	public void bajar() {
		posicion.setY(posicion.getY()+5);
	}

}
