package Ejercicio02;

public class personaDocumentada extends Persona {
	
	private String DNI;

	public personaDocumentada() {
		super();
	}

	public personaDocumentada(String dNI) {
		super();
		DNI = dNI;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	@Override
	public String toString() {
		return "personaDocumentada [DNI=" + DNI + ", getNombre()=" + getNombre() + ", getApellidos()="
				+ getApellidos() + ", getFechaNacimiento()=" + getFechaNacimiento() + "]";
	}
	
	

}
