package StateAction;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import graficos.Assets;

public class KPush extends Estado{

	@Override
	public BufferedImage ejecutarAccion(Graphics g) {
		i=i%4;
		return Assets.knight_push[i];
	}

}
