package vista;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Scanner;

import javax.swing.JFrame;

import command.CommandBGAzul;
import command.CommandBGGris;
import command.CommandBGNegro;
import command.Invoker;
import estados.EstadoJuego;
import graficos.Assets;
import input.KeyBoard;

public class VistaJuego extends JFrame implements Runnable{
	
	public static final int ANCHO=800;
	public static final int ALTO=600;
	private Canvas miCanvas;
	private Thread hilo;
	private boolean ejecutandoHilo=false;
	
	private BufferStrategy bs;
	private Graphics g;
	
	private EstadoJuego estadoJuego;
	
	private KeyBoard keyBoard;
	
	private int personaje;
	
	
	private CommandBGNegro bgNegro;
	private CommandBGGris bgGris;
	private CommandBGAzul bgAzul;
	private Invoker invoker= new Invoker();
	private int fondo=0;
	
	
	public VistaJuego() {
		this.setLayout(new BorderLayout());
		setTitle("Final Modelos de Programación");
		setSize(ANCHO,ALTO);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		
		miCanvas=new Canvas();
		keyBoard=new KeyBoard();
		
		miCanvas.setPreferredSize(new Dimension(ANCHO,ALTO));
		miCanvas.setMaximumSize(new Dimension(ANCHO,ALTO));
		miCanvas.setMinimumSize(new Dimension(ANCHO,ALTO));
		miCanvas.setFocusable(true);

		LaminaMenu miLaminaMenu=new LaminaMenu(this);
		add(miLaminaMenu,BorderLayout.NORTH);
		
		add(miCanvas);
		miCanvas.addKeyListener(keyBoard);
		
		
		bgNegro=new CommandBGNegro(this);
		bgGris=new CommandBGGris(this);
		bgAzul=new CommandBGAzul(this);
		
		
		int opcion=0;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("*********************************");
			System.out.println("Elija un personaje y luego oprima 0");
			System.out.println("1-Knight");
			System.out.println("2-Mage");
			System.out.println("3-Rogue");
			System.out.println("*********************************");
			opcion=sc.nextInt();
			
			if(opcion!=0) {
				setPersonaje(opcion);
			}
			System.out.println("0-Para Iniciar");
			
		}while(opcion!=0);
		
	}
	
	private void actualizar() {
		keyBoard.actualizar();
		estadoJuego.actualizar();
	}
	
	public void cambiarFondoNegro() {
		g.setColor(Color.BLACK);
	}
	public void cambiarFondoGris() {
		g.setColor(Color.LIGHT_GRAY);
	}
	public void cambiarFondoAzul() {
		g.setColor(Color.BLUE);
	}
	
	
	
	
	private void dibujar() {
		bs=miCanvas.getBufferStrategy();
		
		if(bs==null) {
			miCanvas.createBufferStrategy(3);
			return;
		}
		
		g=bs.getDrawGraphics();
		//-------------------------------------
		
		//g.setColor(Color.LIGHT_GRAY);
		
		//System.out.println(fondo);
		
		if(fondo==1) {
			invoker.takeCommand(bgNegro);
		}
		if(fondo==2) {
			invoker.takeCommand(bgGris);
		} 
		if(fondo==3) {
			invoker.takeCommand(bgAzul);
		}
		
		invoker.placeCommands();
		
		
		
		
		
		//cambiarFondoNegro();
		g.fillRect(0, 0, ANCHO, ALTO);
		
		estadoJuego.dibujar(g);
		
		//-------------------------------------
		
		g.dispose();
		bs.show();
		
		
	}
	
	private void init() {
		Assets.init();
		estadoJuego=new EstadoJuego(personaje);
	}
	
	@Override
	public void run() {
		
		init();
		
		while(ejecutandoHilo) {
			try {
				hilo.sleep(25);
				actualizar();
				dibujar();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		finalizarHilo();
	}
	
	public void iniciarHilo() {
		hilo=new Thread(this);
		hilo.start();
		ejecutandoHilo=true;
	}
	
	private void finalizarHilo(){
		try {
			hilo.join();
			ejecutandoHilo=false;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void setPersonaje(int tipo) {
		this.personaje=tipo;
	}

	public void setFondo(int fondo) {
		this.fondo = fondo;
	}
	
	
	
}
