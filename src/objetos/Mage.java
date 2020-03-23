package objetos;

import java.awt.Color;
import java.awt.Graphics;

import StateAction.Estado;
import StateAction.KAttack;
import estados.EstadoJuego;
import graficos.Assets;
import matematica.Vector2D;

public class Mage extends Player implements Personaje{

	private final int TIPO_PERSONAJE=2;
	
	static Estado miEstado;
	
	public Mage(String tipo, Vector2D posicion,Personaje s) {
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
	
	
	@Override
	public void dibujar(Graphics g) {
		g.setColor(Color.BLACK);
		//g.fillRect((int)posicion.getX()+ Assets.knight_stop[0].getWidth()/6+(5), (2)+(int)posicion.getY()+ Assets.knight_stop[0].getWidth()/3+(17),WIDTH_PERSONAJE,HEIGHT_PERSONAJE);
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
