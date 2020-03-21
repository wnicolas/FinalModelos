package estados;

import java.awt.Graphics;

import matematica.Vector2D;
import objetos.DefaultPersonaje;
import objetos.Knight;
import objetos.Mage;
import objetos.Player;
import objetos.Rogue;

public class EstadoJuego {
	
	private Player player;
	
	public static int Tipo_Personaje=0;
	private int tipo=0;
	private Rogue rogue;
	private Mage mage;
	private Knight knight;
	private DefaultPersonaje defaultPersonaje;
	
	public EstadoJuego(int personaje) {
		this.tipo=personaje;
		defaultPersonaje=new DefaultPersonaje();
		rogue=new Rogue("rogue",new Vector2D(100,100),defaultPersonaje);
		mage=new Mage("mage",new Vector2D(100,200),rogue);
		knight=new Knight("knight",new Vector2D(100,300),mage);
		knight.setPersonaje(tipo);
	}
	
	public void actualizar() {
		if(Tipo_Personaje==1) {
			//System.out.println("KNIGHT");
			knight.actualizar();
			
		} 
		if(Tipo_Personaje==2) {
			//System.out.println("MAGE");
			mage.actualizar();
			
		}
		if(Tipo_Personaje==3) {
			//System.out.println("ROGUE");
			rogue.actualizar();			
		}
	}
	public void dibujar(Graphics g) {
		
		if(Tipo_Personaje==1) {
			knight.dibujar(g);
		} 
		
		if(Tipo_Personaje==2) {	
			mage.dibujar(g);
		}
		
		if(Tipo_Personaje==3) {	
			rogue.dibujar(g);			
		}
		
	}
	
	

}
