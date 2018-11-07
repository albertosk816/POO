package Ejercicio01;

public class cuadros extends antiguedades {
	
	private int año;
	private String estilo;
	
	
	
	
	
	public cuadros() {
		super();
	}


	public cuadros(int annoFabricacion, String origen, float precio, int año, String estilo) {
		super(annoFabricacion, origen, precio);
		this.año = año;
		this.estilo = estilo;
	}


	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}


	public String getEstilo() {
		return estilo;
	}


	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}


	@Override
	public String toString() {
		return "cuadros [año=" + año + ", estilo=" + estilo + ", getAnoFabricacion()=" + getAnoFabricacion()
				+ ", getOrigen()=" + getOrigen() + ", getPrecio()=" + getPrecio() + "]";
	}
	
	
	
	
	
	

}
