package objetos;

import java.awt.Graphics;

import StateAction.Estado;
import estados.EstadoJuego;
import graficos.Assets;
import matematica.Vector2D;

public class Rogue extends Player implements Personaje{
	
	private final int TIPO_PERSONAJE=3;
	private Personaje sucesor;
	
	static Estado miEstado;
	
	public Rogue(String tipo, Vector2D posicion, Personaje s) {
		super(tipo, posicion);
		sucesor=s;
	}

	@Override
	public void setPersonaje(int tipo) {
		if(tipo==TIPO_PERSONAJE) {	
			
			EstadoJuego.Tipo_Personaje=3;
		}
		else {
			sucesor.setPersonaje(tipo);
		}
		
	}
	
	@Override
	public void dibujar(Graphics g) {
		Estado.i++;
		g.drawImage(miEstado.ejecutarAccion(g),(int) posicion.getX(), (int)posicion.getY(), null);
		
	}
	
	public static void setEstado(Estado e) {
		miEstado=e;
	}
	public static void ejecutarAccion(Graphics g) {
		miEstado.ejecutarAccion(g);
	}


	
	
}
