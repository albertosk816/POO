package Arkanoid;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Arkanoid extends Canvas{

	public static final int ANCHO = 600;
	public static final int ALTO = 600;
	public static final int FPS = 100; // Frames por segundo
	private static final Stage stage = null;
	
	JFrame ventana = null;

	List<Actor> actores = new ArrayList<Actor>();

//	Base b = new Base();
//	Pelota p = new Pelota(stage);

	Fase faseActiva = null;

	private BufferStrategy strategy;
	
	

	private static Arkanoid instancia = null;
	
		public static  Arkanoid getInstancia () {
		if (instancia == null) {
			instancia = new Arkanoid();
		}
		return instancia;
	}

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


		this.createBufferStrategy(2);
		strategy = this.getBufferStrategy();
		ventana.setIgnoreRepaint(true);
		ventana.setResizable(false);

		this.requestFocus();

		Toolkit.getDefaultToolkit().sync();
		
		// Agrego los controladores de raton y de teclado
		this.addMouseMotionListener(new ControlarporRaton());
//		this.addKeyListener(new ControlarPorTeclado());
	}

	public void initWorld() {

		// Preparaci�n de la primera fase
		this.faseActiva = new Fase01();
		this.faseActiva.inicializaFase();
		// Agregamos los actores de la primera fase a nuestro juego
		this.actores.clear();
		this.actores.addAll(this.faseActiva.getActores());
		// Creaci�n de los actores Base y la Pelota
//		this.actores.add(this.b);
//	    this.actores.add(this.p);
//	    actores = new ArrayList();

//
//	    for (int i = 0; i < 1; i++){
//
//	      Pelota p = new Pelota(stage);
//	      
////	      p.setX(200);
////
////	      p.setY(20);
//
//		    p.setVx(3);
//		    
//		    p.setVy(3);
//
//	      actores.add(p);
//	    } 
  
    for (int i = 0; i < 1; i++) {
	   	
		Base b = new Base(5, 550);
		b.setX(5);
//		b.getX();
		b.setY(550);		

	    actores.add(b);
	}
//   
	}

	public void updateWorld() {
		for (int i = 0; i < actores.size(); i++) {
			Actor e = (Actor)actores.get(i);
			e.act();
		}
	}
	
	public void paintWorld() {
		Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
		// Lo primero que hace cada frame es pintar un rect�ngulo tan grande como la escena,
		// para superponer la escena anterior.
		g.setColor(Color.black);
		g.fillRect( 0, 0, getWidth(), getHeight());

		// Ejecutamos el m�todo paint de cada uno de los actores
		for (Actor actores : this.actores) {
			actores.paint(g);
		}
		// Una vez construida la escena nueva, la mostramos.
		strategy.show();
	}	

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
////	
//	public Base getBase() { return b; }
//	public Pelota getPelota() { return p; }
	
	public static void main(String[] args) {
		
		Arkanoid ark = new Arkanoid();
		ark.game();
	}
}
