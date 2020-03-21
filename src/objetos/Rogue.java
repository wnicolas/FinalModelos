package objetos;

import java.awt.Graphics;

import estados.EstadoJuego;
import graficos.Assets;
import matematica.Vector2D;

public class Rogue extends Player implements Personaje{
	
	private final int TIPO_PERSONAJE=3;
	private Personaje sucesor;
	
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
	
	
	int i=0;
	@Override
	public void dibujar(Graphics g) {
		i++;
		i=i%7;
		g.drawImage(Assets.rogue_attack[i],(int) posicion.getX(), (int)posicion.getY(), null);
		
	}
	
	
}
