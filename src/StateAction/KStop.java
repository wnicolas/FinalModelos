package StateAction;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import graficos.Assets;

public class KStop extends Estado{

	@Override
	public BufferedImage ejecutarAccion(Graphics g) {
		return Assets.knight_stop[0];
	}

}
