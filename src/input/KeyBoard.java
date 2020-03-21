package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoard implements KeyListener{

	private boolean[] keys= new boolean[256];
	
	public static boolean W;
	public static boolean A;
	public static boolean S;
	public static boolean D;
	public static boolean J;//Salto
	public static boolean K;//Ataque
	public static boolean M;//Mute
	
	public KeyBoard() {
		W=false;
		A=false;
		S=false;
		D=false;
		J=false;
		K=false;
		M=false;
		
	}
	
	public void actualizar() {
		W=keys[KeyEvent.VK_W];
		A=keys[KeyEvent.VK_A];
		S=keys[KeyEvent.VK_S];
		D=keys[KeyEvent.VK_D];
		J=keys[KeyEvent.VK_J];
		K=keys[KeyEvent.VK_K];
		M=keys[KeyEvent.VK_M];
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()]=true;
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()]=false;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

}
