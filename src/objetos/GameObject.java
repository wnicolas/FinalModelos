package objetos;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import matematica.Vector2D;

public abstract class GameObject {

	protected BufferedImage textura;
	protected Vector2D posicion;
	
	public GameObject(BufferedImage textura, Vector2D posicion) {
		this.textura=textura;
		this.posicion=posicion;
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
