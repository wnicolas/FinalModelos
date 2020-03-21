package objetos;

import java.awt.Graphics;

import StateAction.KAttack;
import StateAction.KJump;
import StateAction.KStop;
import StateAction.KWalk;
import input.KeyBoard;
import matematica.Vector2D;
import sonido.AttackSound;
import sonido.JumpSound;
import sonido.Observador;
import sonido.OffSound;
import sonido.Strategy;

public class Player extends GameObject {
	
	Strategy sonido;
	OffSound offSound;
	
	public Player(String tipo, Vector2D posicion) {
		super(tipo, posicion);
		offSound=new OffSound();
		
	}
	
	@Override
	public void actualizar() {
		if(KeyBoard.W)
			posicion.setY(posicion.getY()-5);
		if(KeyBoard.D)
			posicion.setX(posicion.getX()+5);
			Knight.setEstado(new KWalk());
		if(KeyBoard.S)
			posicion.setY(posicion.getY()+5);
		if(KeyBoard.A) {
			posicion.setX(posicion.getX()-5);
		}
		if(KeyBoard.M) {
			System.out.println(offSound.off);
			offSound.changeOffSound();			
		}
		if(KeyBoard.J) {
			Knight.setEstado(new KJump());
			sonido=new JumpSound(offSound.off);
		}
		if(KeyBoard.K) {			
			Knight.setEstado(new KAttack());
			sonido=new AttackSound(offSound.off);
		}
		if(KeyBoard.W==false&&KeyBoard.D==false && KeyBoard.S==false && KeyBoard.A==false && KeyBoard.J==false && KeyBoard.K==false) {
			Knight.setEstado(new KStop());
		}
		
	}
	
	@Override
	public void dibujar(Graphics g) {

	}
	
	
}
