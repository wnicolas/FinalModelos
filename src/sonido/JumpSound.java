package sonido;

import java.applet.AudioClip;

import objetos.Player;

public class JumpSound implements Strategy,Observador{
	
	private OffSound offSound;
	private boolean off;
	
	public JumpSound(OffSound offSound) {
		this.offSound=offSound;
		offSound.enlazarObservadores(this);
	}
	public JumpSound(boolean off) {
		if(off==false) {
			getSonido();
		}
	}

	@Override
	public void getSonido() {
		AudioClip sonido;
		sonido=java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/saltar.wav"));
		sonido.play();
	}

	@Override
	public void actualizar(boolean off) {
		if(off) {
			this.off=false;
		}else {
			this.off=true;
		}
		
	}


}
