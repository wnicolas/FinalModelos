package StateAction;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import graficos.Assets;

public class RStop extends Estado {

	@Override
	public BufferedImage ejecutarAccion(Graphics g) {
		return Assets.rogue_stop[0];
	}

}
