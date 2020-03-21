package StateAction;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class Estado {
	
	public static int i=0;
	public abstract BufferedImage ejecutarAccion(Graphics g);

}
