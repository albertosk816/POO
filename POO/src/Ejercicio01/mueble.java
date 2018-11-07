package Ejercicio01;

public class mueble extends antiguedades {
	
	private String material;

	public mueble() {
		super();
	}

	public mueble(int annoFabricacion, String origen, float precio, String material) {
		super(annoFabricacion, origen, precio);
		this.material = material;
		
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "mueble [material=" + material + ", getAnoFabricacion()=" + getAnoFabricacion() + ", getOrigen()="
				+ getOrigen() + ", getPrecio()=" + getPrecio() + "]";
	}
	
	
	
	

}
