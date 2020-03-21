package sonido;

import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import graficos.Loader;
import objetos.Player;

public class AttackSound implements Strategy,Observador{
	
	private OffSound offSound;
	private boolean off;
	
	public AttackSound(OffSound offSound) {
		this.offSound=offSound;
		offSound.enlazarObservadores(this);
	}
	public AttackSound(boolean off) {
		if(off==false) {
			getSonido();
		}
	}


	@Override
	public void getSonido() {		
			try {
				Clip clip= AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(AttackSound.class.getResourceAsStream("/sonidos/atacar.wav")));
				clip.setFramePosition(20000);
				clip.start();
			} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
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
