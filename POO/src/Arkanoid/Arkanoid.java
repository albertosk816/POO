package Arkanoid;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Arkanoid extends Canvas{


	public static final int ANCHO = 400;
	public static final int ALTO = 600;
	public static final int FPS = 100; // Frames por segundo
	
	JFrame ventana = null;

	List<Actor> actores = new ArrayList<Actor>();

	Base b = new Base();
	Pelota p = new Pelota();

	Fase faseActiva = null;

	private BufferStrategy strategy;
	
	

	private static Arkanoid instancia = null;
	
		public static Arkanoid getInstancia () {
		if (instancia == null) {
			instancia = new Arkanoid();
		}
		return instancia;
	}
	
//	public static final int ANCHO = 400;
//	public static final int ALTO = 600;
//	public static final int FPS = 100; // Frames por segundo
//	
//	private BufferStrategy strategy;
//	private long usedTime;
//	
//	private SpriteCache spriteCache;
//	private ArrayList actors; 
	

	
	public Arkanoid() {
		

		ventana = new JFrame("Arkanoid");

		JPanel panel = (JPanel) ventana.getContentPane();

		this.setBounds(0,0,ANCHO,ALTO);

		panel.setPreferredSize(new Dimension(ANCHO,ALTO));
		panel.setLayout(null);
		panel.add(this);

		ventana.setBounds( 0, 0, ANCHO+5, ALTO+28);
		ventana.setVisible(true);

		// Creaci�n de la estrategia de doble b�ffer
		this.createBufferStrategy(2);
		strategy = this.getBufferStrategy();
		// Con ignoreRepaint le decimos al JFrame que no debe repintarse cuando el Sistema Operativo se lo indique,
		// nosotros nos ocupamos totalmente del refresco de la pantalla
		ventana.setIgnoreRepaint(true);
		// La ventana no podr� redimensionarse
		ventana.setResizable(false);
		// Hacemos que el Canvas obtenga autom�ticamente el foco del programa para que, si se pulsa una tecla, la pulsaci�n
		// se transmita directamente al Canvas.
		this.requestFocus();
		// Para resolver un problema de sincronizaci�n con la memoria de v�deo de Linux, utilizamos esta l�nea
		Toolkit.getDefaultToolkit().sync();
		
		// Agrego los controladores de rat�n y de teclado
		this.addMouseMotionListener(new ControlarporRaton());
//		this.addKeyListener(new ControlarPorTeclado());
	}
//		JFrame ventana = new JFrame("Arkanoid");
//		JPanel panel = (JPanel)ventana.getContentPane();
//		setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
//		panel.setPreferredSize(new Dimension(Stage.WIDTH,Stage.HEIGHT));
//		panel.setLayout(null);
//		panel.add(this);
//		ventana.setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
//		ventana.setVisible(true);
//		ventana.addWindowListener( new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//
//		});
//
////		 addMouseMotionListener(new MouseMotionAdapter(){
////		 @Override
////	     public void mouseMoved(MouseEvent evento){
////			   evento.getX();
////			   evento.getY();
////			 }
////		});
//			  
//		ventana.setResizable(false);
//		createBufferStrategy(2);
//		strategy = getBufferStrategy();
//		requestFocus();
//	}

	public void initWorld() {
	 
		// Preparaci�n de la primera fase
		this.faseActiva = new Fase01();
		this.faseActiva.inicializaFase();
		// Agregamos los actores de la primera fase a nuestro juego
		this.actores.clear();
		this.actores.addAll(this.faseActiva.getActores());
		// Creaci�n de los actores Nave y Bola
	    this.actores.add(this.b);
	    this.actores.add(this.p);
//    actors = new ArrayList();
//
// 
//
//    for (int i = 0; i < 1; i++){
//
//      Pelota m = new Pelota(this);
//
//      m.setY(20);
//
//	    m.setVx(3);
//	    
//	    m.setVy(3);
//
//      actors.add(m);
//    }
//     
//    
//    for (int i = 0; i < 1; i++) {
//
//    	   	
//		Base b = new Base(this);
////		b.setX(5);
////		b.getX();
////		b.setY(550);
//
//		
//
//	    actors.add(b);
//	}
//    
////    int aumento = 50;
////    int bloque = 0;
//   for (int i = 0; i < 5; i++) {
////
//		Bloques bl = new Bloques(null);
////
////    	bl.setX(bloque);
////		bloque+=51;
////    	
////		bl.setY(aumento);
////		aumento+=50;
//
//		
//
//	    actors.add(bl);
//	}

    
	}

	public void updateWorld() {
		for (int i = 0; i < actores.size(); i++) {
			Actor p = (Actor)actores.get(i);
			p.act();
		}
	}
	
	public void paintWorld() {
		Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
		// Lo primero que hace cada frame es pintar un rect�ngulo tan grande como la escena,
		// para superponer la escena anterior.
		g.setColor(Color.black);
		g.fillRect( 0, 0, getWidth(), getHeight());

		// Ejecutamos el m�todo paint de cada uno de los actores
		for (Actor actor : this.actores) {
			actor.paint(g);
		}
		// Una vez construida la escena nueva, la mostramos.
		strategy.show();
	}
	public void mouseMoved(MouseEvent event) {
		 
		
	}
		
		
//		Graphics2D g = (Graphics2D)strategy.getDrawGraphics();
//		//Aqui tendre que poner el fondo pra el juego
//		
//		
//		g.setColor(Color.black);
//		g.fillRect(0,0,getWidth(),getHeight());
//		for (int i = 0; i < actors.size(); i++) {
//			Actor m = (Actor)actors.get(i);
//			m.paint(g);
//		}
//
//		g.setColor(Color.white);
//		if (usedTime > 0)
//		  g.drawString(String.valueOf(1000/usedTime)+" fps",0,Stage.HEIGHT-50);
//  	else
//	  	g.drawString("--- fps",0,Stage.HEIGHT-50);
//		strategy.show();
//}
	
	
	
	public void game() {
		
		initWorld();
		
		while (this.isVisible()) {
			// Tomamos el tiempo en milisegundos antes de repintar el frame
			long millisAntesDeConstruirEscena = System.currentTimeMillis();
			// Actualizamos y pintamos el nuevo frame
			updateWorld();
			paintWorld();
			// Calculamos la cantidad de milisegundos que se ha tardado en realizar un nuevo frame del juego
			int millisUsados = (int) (System.currentTimeMillis() - millisAntesDeConstruirEscena);
			// Hago que el programa duerma lo suficiente para que realmente se ejecuten la cantidad de FPS
			// que tenemos programados
			try { 
				int millisADetenerElJuego = 1000 / FPS - millisUsados;
				if (millisADetenerElJuego >= 0) {
					 Thread.sleep(millisADetenerElJuego);
				}
			} catch (InterruptedException e) {}
		}
	}
	
	public Base getNave() { return b; }
	public Pelota getBola() { return p; }
	
	public static void main(String[] args) {
		
		Arkanoid ark = new Arkanoid();
		ark.game();
	}



}
