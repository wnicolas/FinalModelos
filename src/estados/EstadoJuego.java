package estados;

import java.awt.Graphics;
import java.util.ArrayList;

import graficos.Assets;
import matematica.Vector2D;
import objetos.Ascensor;
import objetos.DefaultPersonaje;
import objetos.Escalera;
import objetos.Knight;
import objetos.Mage;
import objetos.Muro;
import objetos.Player;
import objetos.Rogue;
import vista.VistaJuego;

public class EstadoJuego {
	
	public static int Tipo_Personaje=0;
	private int tipo=0;
	private Rogue rogue;
	private Mage mage;
	private Knight knight;
	private DefaultPersonaje defaultPersonaje;


	public static Muro muro1;
	
	private Muro muro2=new Muro("muro", new Vector2D((100),(280)));
	public static Muro muro3;
	private Muro muro4=new Muro("muro", new Vector2D((300),(80)));
	private Muro muro6=new Muro("muro", new Vector2D((400),(280)));
	
	private Muro muro5=new Muro("muro", new Vector2D((500),(280)));
	
	public static Muro muro13;
	private Muro muro12=new Muro("muro", new Vector2D((100),(460)));
	private Muro muro11=new Muro("muro", new Vector2D((200),(460)));
	private Muro muro10=new Muro("muro", new Vector2D((300),(460)));
	private Muro muro7=new Muro("muro", new Vector2D((400),(460)));
	private Muro muro8=new Muro("muro", new Vector2D((500),(460)));
	private Muro muro9=new Muro("muro", new Vector2D((600),(505)));
	private Muro muro14=new Muro("muro", new Vector2D((700),(460)));
	private Muro muro15=new Muro("muro", new Vector2D((700),(360)));
	private Muro muro16=new Muro("muro", new Vector2D((700),(260)));
	private Muro muro17=new Muro("muro", new Vector2D((700),(160)));
	private Muro muro18=new Muro("muro", new Vector2D((700),(60)));
	private Muro muro19=new Muro("muro", new Vector2D((700),(0)));
	
	private Escalera escalera1=new Escalera("escalera",new Vector2D(150,80));
	private Escalera escalera2=new Escalera("escalera",new Vector2D(150,180));
	private Escalera escalera3=new Escalera("escalera",new Vector2D(400,80));
	private Escalera escalera4=new Escalera("escalera",new Vector2D(400,180));
	
	public static Ascensor ascensor=new Ascensor("ascensor",new Vector2D(600,280));
	
	
	public EstadoJuego(int personaje) {
		this.tipo=personaje;
		defaultPersonaje=new DefaultPersonaje();
		rogue=new Rogue("rogue",new Vector2D(400,170),defaultPersonaje);
		mage=new Mage("mage",new Vector2D(400,170),rogue);
		knight=new Knight("knight",new Vector2D(400,170),mage);
		knight.setPersonaje(tipo);
		
		muro1=new Muro("muro", new Vector2D((0),(280)));
		muro3=new Muro("muro", new Vector2D((200),(80)));
		muro13=new Muro("muro", new Vector2D((0),(460)));
				
	}
	
	public void actualizar() {
		if(Tipo_Personaje==1) {
			knight.actualizar();
			
		} 
		if(Tipo_Personaje==2) {
			mage.actualizar();
			
		}
		if(Tipo_Personaje==3) {
			rogue.actualizar();			
		}
		
		ascensor.actualizar();
	}
	
	public void dibujar(Graphics g) {
		
		muro1.dibujar(g);
		muro2.dibujar(g);
		muro3.dibujar(g);
		muro4.dibujar(g);
		muro5.dibujar(g);
		muro6.dibujar(g);
		muro7.dibujar(g);
		muro8.dibujar(g);
		muro9.dibujar(g);
		muro10.dibujar(g);
		muro11.dibujar(g);
		muro12.dibujar(g);
		muro13.dibujar(g);
		muro14.dibujar(g);
		muro15.dibujar(g);
		muro16.dibujar(g);
		muro17.dibujar(g);
		muro18.dibujar(g);
		muro19.dibujar(g);
		
		escalera1.dibujar(g);
		escalera2.dibujar(g);
		escalera3.dibujar(g);
		escalera4.dibujar(g);
		
		ascensor.dibujar(g);
		
		
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
