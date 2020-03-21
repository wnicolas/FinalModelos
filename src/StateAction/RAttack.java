package StateAction;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import graficos.Assets;

public class RAttack extends Estado {

	@Override
	public BufferedImage ejecutarAccion(Graphics g) {
		i=i%7;
		return Assets.rogue_attack[i];
	}

}
