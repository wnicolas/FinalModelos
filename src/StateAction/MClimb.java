package StateAction;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import graficos.Assets;

public class MClimb extends Estado {

	@Override
	public BufferedImage ejecutarAccion(Graphics g) {
		i=i%3;
		return Assets.mage_climb[i];
	}

}
