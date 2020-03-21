package StateAction;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import graficos.Assets;

public class MStop extends Estado{

	@Override
	public BufferedImage ejecutarAccion(Graphics g) {
		
		return Assets.mage_stop[0];
	}

}
