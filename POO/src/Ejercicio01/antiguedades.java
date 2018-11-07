package Ejercicio01;

public class antiguedades extends ColeccionAntiguedades {
	
	private int annoFabricacion;
	private String origen;
	private float precio;
	
	
	

	public antiguedades() {
		super();
	}
	
	
	public antiguedades(int annoFabricacion, String origen, float precio) {
		super();
		this.annoFabricacion = annoFabricacion;
		this.origen = origen;
		this.precio = precio;
	}




	public int getAnoFabricacion() {
		return annoFabricacion;
	}
	public void setAnnoFabricacion(int annoFabricacion) {
		this.annoFabricacion = annoFabricacion;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
