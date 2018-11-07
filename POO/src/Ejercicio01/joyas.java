package Ejercicio01;

public class joyas extends antiguedades {
	
	private String materialFabricacion;

	
	
	
	public joyas() {
		super();
	}




	public joyas(int annoFabricacion, String origen, float precio, String materialFabricacion) {
		super(annoFabricacion, origen, precio);
		this.materialFabricacion = materialFabricacion;
	}




	public String getMaterialFabricacion() {
		return materialFabricacion;
	}




	public void setMaterialFabricacion(String materialFabricacion) {
		this.materialFabricacion = materialFabricacion;
	}




	@Override
	public String toString() {
		return "joyas [materialFabricacion=" + materialFabricacion + ", getAnoFabricacion()=" + getAnoFabricacion()
				+ ", getOrigen()=" + getOrigen() + ", getPrecio()=" + getPrecio() + "]";
	}
	
	
	
	

}
