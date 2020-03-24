package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import command.CommandBGGris;
import command.CommandBGNegro;
import command.Invoker;

public class LaminaMenu extends JPanel implements ActionListener{
	
	private JMenuBar miBarra=new JMenuBar();
	private JMenu fondo=new JMenu("Fondo");
	
	private JMenuItem negro=new JMenuItem("Negro");
	private JMenuItem gris=new JMenuItem("Gris");
	private JMenuItem azul=new JMenuItem("Azul");
	
	VistaJuego miVistaJuego;
	

	public LaminaMenu(VistaJuego miVistaJuego){
 
		this.miVistaJuego=miVistaJuego;
		
	    fondo.add(negro);
	    fondo.add(gris);
	    fondo.add(azul);  
	    
	    miBarra.add(fondo);
	    add(miBarra);
	    
	    negro.addActionListener(this);
	    gris.addActionListener(this);
	    azul.addActionListener(this);
	      
	      }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==negro) {
			miVistaJuego.setFondo(1);
		
		}else if(e.getSource()==gris) {
			miVistaJuego.setFondo(2);
			
		}else if(e.getSource()==azul) {
			
			miVistaJuego.setFondo(3);
		}
		
		
	}
}
