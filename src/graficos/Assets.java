package graficos;

import java.awt.image.BufferedImage;

public class Assets {

	public static BufferedImage muro;
	public static BufferedImage escalera;
	public static BufferedImage ascensor;
	public static BufferedImage llamarAscensor;
	public static BufferedImage roca;
	
	public static BufferedImage[] rogue_idle=new BufferedImage[17];
	public static BufferedImage[] rogue_attack=new BufferedImage[7];
	public static BufferedImage[] rogue_walk=new BufferedImage[6];
	public static BufferedImage[] rogue_jump=new BufferedImage[7];
	public static BufferedImage[] rogue_push=new BufferedImage[4];
	public static BufferedImage[] rogue_stop=new BufferedImage[1];
	public static BufferedImage[] rogue_climb=new BufferedImage[3];
	
	
	public static BufferedImage[] mage_attack=new BufferedImage[7];
	public static BufferedImage[] mage_stop=new BufferedImage[1];
	public static BufferedImage[] mage_idle=new BufferedImage[14];
	public static BufferedImage[] mage_walk=new BufferedImage[6];
	public static BufferedImage[] mage_jump=new BufferedImage[7];
	public static BufferedImage[] mage_climb=new BufferedImage[3];
	
	
	public static BufferedImage[] knight_attack=new BufferedImage[5];
	public static BufferedImage[] knight_walk=new BufferedImage[6];
	public static BufferedImage[] knight_iwalk=new BufferedImage[6];
	public static BufferedImage[] knight_jump=new BufferedImage[7];
	public static BufferedImage[] knight_push=new BufferedImage[4];
	public static BufferedImage[] knight_stop=new BufferedImage[1];
	public static BufferedImage[] knight_climb=new BufferedImage[3];
	
	
	
	public static void init() {
		
		//Cargando mundo
		muro=Loader.imageLoader("/obstaculos/muro.png");
		escalera=Loader.imageLoader("/obstaculos/escalera.png");
		ascensor=Loader.imageLoader("/obstaculos/ascensor.png");
		llamarAscensor=Loader.imageLoader("/obstaculos/llamarAscensor.png");
		roca=Loader.imageLoader("/obstaculos/roca.png");
		
		//Cargando accion attack
		for(int i=0;i<7;i++) {
			rogue_attack[i]=Loader.imageLoader("/rogue_attack/Attack"+(i+1)+".png");
			mage_attack[i]=Loader.imageLoader("/mage_attack/Attack"+(i+1)+".png");
		}
		for(int i=0;i<5;i++) {
			knight_attack[i]=Loader.imageLoader("/knight_attack/attack"+(i)+".png");
		}
		
		//Cargando accio walk
		for(int i=0;i<6;i++) {
			rogue_walk[i]=Loader.imageLoader("/rogue_walk/walk"+(i+1)+".png");
			knight_walk[i]=Loader.imageLoader("/knight_walk/walk"+(i+1)+".png");
			knight_iwalk[i]=Loader.imageLoader("/knight_walk/walk"+(i+1)+"-ConvertImage.png");
			mage_walk[i]=Loader.imageLoader("/mague_walk/walk"+(i+1)+".png");
		}
		
		//Cargando accion idle
		
		for(int i=0;i<17;i++) {
			rogue_idle[i]=Loader.imageLoader("/rogue_idle/idle"+(i+1)+".png");
		}
		for(int i=0;i<14;i++) {
			mage_idle[i]=Loader.imageLoader("/mage_idle/idle"+(i+1)+".png");
		}
		
		//Cargando accion jump
		
		for(int i=0;i<7;i++) {
			rogue_jump[i]=Loader.imageLoader("/rogue_jump/jump"+(i+1)+".png");
			knight_jump[i]=Loader.imageLoader("/knight_jump/jump"+(i+1)+".png");
			mage_jump[i]=Loader.imageLoader("/mage_jump/jump"+(i+1)+".png");
		}
		
		//Cargando accion push
		
		for(int i=0;i<4;i++) {
			rogue_push[i]=Loader.imageLoader("/rogue_push/push"+(i+1)+".png");
			knight_push[i]=Loader.imageLoader("/knight_push/push"+(i+1)+".png");
		}
		
		//Cargando accion stop
		rogue_stop[0]=Loader.imageLoader("/rogue_idle/idle1.png");
		knight_stop[0]=Loader.imageLoader("/knight_idle/idle1.png");
		mage_stop[0]=Loader.imageLoader("/mage_idle/idle1.png");		
		
		//Cargando accion climb
		
		for(int i=0;i<3;i++) {
			rogue_climb[i]=Loader.imageLoader("/rogue_clim/climb"+(i+2)+".png");
			mage_climb[i]=Loader.imageLoader("/mage_climb/climb"+(i+2)+".png");
			knight_climb[i]=Loader.imageLoader("/knight_clim/climb"+(i+2)+".png");
		}
		
		
	}
	
	

}
