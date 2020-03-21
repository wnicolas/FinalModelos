package StateAction;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import graficos.Assets;

public class MIdle extends Estado{

	@Override
	public BufferedImage ejecutarAccion(Graphics g) {
		i=i%14;
		return Assets.mage_idle[i];
		}

}
