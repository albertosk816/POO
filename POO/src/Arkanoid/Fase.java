package Arkanoid;

import java.util.ArrayList;
import java.util.List;

public abstract class Fase {
	
	// Lista de actores a colocar en cualquier fase
	protected List<Actor> actores = new ArrayList<Actor>();
	
	// M�todo que debe implementar cada Fase
	public abstract void inicializaFase ();

	// Getter de la lista de actores
	public List<Actor> getActores() { return actores; }
}