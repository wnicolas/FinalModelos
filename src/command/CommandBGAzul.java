package command;

import vista.VistaJuego;

public class CommandBGAzul implements Command{

	private VistaJuego miVistaJuego;

	public CommandBGAzul(VistaJuego miVistaJuego) {
		this.miVistaJuego=miVistaJuego;
	}
	
	@Override
	public void ejecutar() {
		miVistaJuego.cambiarFondoAzul();
		
	}

}
