package sonido;

import java.util.ArrayList;

public class OffSound implements Sujeto{
	
	public boolean off=false;
	private ArrayList<Observador> observadores;
	
	public OffSound() {
		observadores=new ArrayList<Observador>();
	}
	
	public void changeOffSound() {
		if(off) {
			off=false;
		}else {			
			off=true;
		}
		notificar();
	}
	
	public void enlazarObservadores(Observador o) {
		observadores.add(o);
	}

	@Override
	public void notificar() {
		for(Observador o: observadores) {
			o.actualizar(off);
		}
		
	}


}
