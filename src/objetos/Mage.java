package objetos;

import java.awt.Graphics;

import estados.EstadoJuego;
import graficos.Assets;
import matematica.Vector2D;

public class Mage extends Player implements Personaje{

	private final int TIPO_PERSONAJE=2;
	private Personaje sucesor;
	
	public Mage(String tipo, Vector2D posicion, Personaje s) {
		super(tipo, posicion);
		sucesor=s;
	}

	@Override
	public void setPersonaje(int tipo) {
		if(tipo==TIPO_PERSONAJE) {	
			
			EstadoJuego.Tipo_Personaje=2;
		}
		else {
			sucesor.setPersonaje(tipo);
		}
		
	}
	
	int i=0;
	@Override
	public void dibujar(Graphics g) {
		i++;
		i=i%4;
		g.drawImage(Assets.mage_attack[i],(int) posicion.getX(), (int)posicion.getY(), null);
		
	}

}
