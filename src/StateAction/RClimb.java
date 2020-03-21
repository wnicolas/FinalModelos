package StateAction;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import graficos.Assets;

public class RClimb extends Estado {

	@Override
	public BufferedImage ejecutarAccion(Graphics g) {
		i=i%3;
		return Assets.rogue_climb[i];
	}

}
