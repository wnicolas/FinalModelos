package objetos;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import matematica.Vector2D;

public abstract class GameObject {

	protected Vector2D posicion;
	protected String tipo;
	
	public GameObject(String tipo, Vector2D posicion) {
		this.posicion=posicion;
		this.tipo=tipo;
	}
	
	public abstract void actualizar();
	public abstract void dibujar(Graphics g);

	public Vector2D getPosicion() {
		return posicion;
	}

	public void setPosicion(Vector2D posicion) {
		this.posicion = posicion;
	}
	
	
	
}
