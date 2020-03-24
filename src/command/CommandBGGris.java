package command;

import vista.VistaJuego;

public class CommandBGGris implements Command{


	private VistaJuego miVistaJuego;

	public CommandBGGris(VistaJuego miVistaJuego) {
		this.miVistaJuego=miVistaJuego;
	}
	
	@Override
	public void ejecutar() {
		miVistaJuego.cambiarFondoGris();
		
	}

}
