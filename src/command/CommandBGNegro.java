package command;

import vista.VistaJuego;

public class CommandBGNegro implements Command {

	private VistaJuego miVistaJuego;

	public CommandBGNegro(VistaJuego miVistaJuego) {
		this.miVistaJuego=miVistaJuego;
	}
	
	@Override
	public void ejecutar() {
		miVistaJuego.cambiarFondoNegro();
		
	}



}
