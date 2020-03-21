package StateAction;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import graficos.Assets;

public class MJump extends Estado {

	@Override
	public BufferedImage ejecutarAccion(Graphics g) {
		i=i%5;
		return Assets.mage_jump[i];
	}

}
