package objetos;

import java.awt.Color;
import java.awt.Graphics;

import StateAction.Estado;
import StateAction.KAttack;
import StateAction.KClimb;
import StateAction.KJump;
import StateAction.KStop;
import StateAction.KWalk;
import StateAction.MAttack;
import StateAction.MClimb;
import StateAction.MIdle;
import StateAction.MJump;
import StateAction.MStop;
import StateAction.MWalk;
import StateAction.RAttack;
import StateAction.RClimb;
import StateAction.RJump;
import StateAction.RStop;
import StateAction.RWalk;
import estados.EstadoJuego;
import graficos.Assets;
import input.KeyBoard;
import matematica.Vector2D;
import sonido.AttackSound;
import sonido.JumpSound;
import sonido.Observador;
import sonido.OffSound;
import sonido.Strategy;

public class Player extends GameObject {
	
	private Strategy sonido;
	private OffSound offSound;
	
	protected Personaje sucesor;

	protected final int WIDTH_PERSONAJE=36;
	protected final int HEIGHT_PERSONAJE=50;
	protected final int MARGENIZQUIERDA=26;
	protected final int MARGENDERECHA=60;
	
	Vector2D centroPersonaje=new Vector2D(42,85);
	
	protected boolean onFloor=false;
	protected boolean onStair=false;
	static boolean onElevator=false;
	
	
	public Player(String tipo, Vector2D posicion) {
		super(tipo, posicion);
		offSound=new OffSound();
	}
	
	@Override
	public void actualizar() {
		
		
		
		if((posicion.getX()>=570 && posicion.getX()<=640)) {
			if(posicion.getY()+110==EstadoJuego.ascensor.getPosicion().getY()) {
				onElevator=true;
				EstadoJuego.ascensor.activo=true;
				
			}
		}
		else {
			onElevator=false;
			EstadoJuego.ascensor.activo=false;
		}
		
		if(onElevator) {
			posicion.setY(EstadoJuego.ascensor.getPosicion().getY()-110);
		}
		

		//************************************************************************
		if(posicion.getX()>=115 && posicion.getX()<=140) {
			onStair=true;
		}else if(posicion.getX()>=365 && posicion.getX()<=395){
			onStair=true;
		}else if(posicion.getX()>=565 && posicion.getX()<=595){
			onStair=true;
		}else{
			onStair=false;
		}
		
		
		if(KeyBoard.W) {
			if(onStair==true && (posicion.getY()>=-20)) {
				posicion.setY(posicion.getY()-5);
				Knight.setEstado(new KClimb());
				Mage.setEstado(new MClimb());
				Rogue.setEstado(new RClimb());
			}else if(onFloor){

			}else {
				posicion.setY(posicion.getY()+5);

			}
		}
		
		//************************************************************************
		
		if(KeyBoard.D) {
			posicion.setX(posicion.getX()+5);
			Knight.setEstado(new KWalk());
			Mage.setEstado(new MWalk());
			Rogue.setEstado(new RWalk());
		}
		
		
		//************************************************************************
		if((posicion.getY()==(EstadoJuego.muro1.getPosicion().getY()-110)&& (posicion.getX()<200-MARGENIZQUIERDA || (posicion.getX()>400-MARGENIZQUIERDA-WIDTH_PERSONAJE&&posicion.getX()<600-MARGENIZQUIERDA)))){
			onFloor=true;
		}else if(posicion.getY()==(EstadoJuego.muro3.getPosicion().getY()-100)&&(posicion.getX()>200-MARGENIZQUIERDA+5-WIDTH_PERSONAJE&&posicion.getX()<400-MARGENIZQUIERDA)) {
			onFloor=true;
		}else if(posicion.getY()==(EstadoJuego.muro13.getPosicion().getY()-100)){
			onFloor=true;
		}else{
			onFloor=false;
		}
		
		
		if(KeyBoard.S) {
			if(onFloor==false) {
				posicion.setY(posicion.getY()+5);				
				Knight.setEstado(new KClimb());
				Mage.setEstado(new MClimb());
				Rogue.setEstado(new RClimb());
			}else {
				posicion.setY(posicion.getY()-5);
			}
		}		
		//************************************************************************
		

		
		if(KeyBoard.A) {
			posicion.setX(posicion.getX()-5);
		}
		
		if(KeyBoard.M) {
			System.out.println(offSound.off);
			offSound.changeOffSound();			
		}
		
		if(KeyBoard.J) {
			Knight.setEstado(new KJump());
			Mage.setEstado(new MJump());
			Rogue.setEstado(new RJump());
			sonido=new JumpSound(offSound.off);
		}
		
		if(KeyBoard.K) {			
			Knight.setEstado(new KAttack());
			Mage.setEstado(new MAttack());
			Rogue.setEstado(new RAttack());
			sonido=new AttackSound(offSound.off);
		}
		
		if(KeyBoard.W==false&&KeyBoard.D==false && KeyBoard.S==false && KeyBoard.A==false && KeyBoard.J==false && KeyBoard.K==false) {
			Knight.setEstado(new KStop());
			Mage.setEstado(new MStop());
			Rogue.setEstado(new RStop());
		}
		
		//************************************
		
		//System.out.println("X="+posicion.getX()+"Y="+posicion.getY());
		
	
		if((posicion.getX()<=10&&posicion.getY()==355)||(posicion.getX()<=10&&posicion.getY()==360)||(posicion.getX()<=10&&posicion.getY()==350)) {
			System.out.println("GANASTEEEEEEEEEE");
			System.out.println("GANASTEEEEEEEEEE");
			System.out.println("GANASTEEEEEEEEEE");
			System.out.println("GANASTEEEEEEEEEE");
		}
		
		//************************************
		
				
		
		
	}
	
	@Override
	public void dibujar(Graphics g) {
	}
	
	
}
