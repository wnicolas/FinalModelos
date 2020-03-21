package StateAction;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import graficos.Assets;

public class RWalk extends Estado {

	@Override
	public BufferedImage ejecutarAccion(Graphics g) {
		i=i%6;
		return Assets.rogue_walk[i];
	}

}
