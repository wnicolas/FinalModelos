package estados;

import java.awt.Graphics;

import graficos.Assets;
import matematica.Vector2D;
import objetos.Player;

public class EstadoJuego {
	
	private Player player;
	
	public EstadoJuego() {
		player=new Player(Assets.player,new Vector2D(500,200));
	}
	
	public void actualizar() {
		
		player.actualizar();
	}
	public void dibujar(Graphics g) {
		player.dibujar(g);
		
	}

}
