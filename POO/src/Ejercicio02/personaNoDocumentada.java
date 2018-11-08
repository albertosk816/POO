package Ejercicio02;

public class personaNoDocumentada extends Persona {
	

	private String descripcion;

	public personaNoDocumentada() {
		super();
	}

	public personaNoDocumentada(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "personaNoDocumentada [descripcion=" + descripcion + ", getNombre()=" + getNombre() + ", getApellidos()="
				+ getApellidos() + ", getFechaNacimiento()=" + getFechaNacimiento() + "]";
	}
	
	

}
