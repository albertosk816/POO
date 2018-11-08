package Ejercicio02;

public class bachillerato extends Matricula {
	

	private String modalidad;

	public bachillerato() {
		super();
	}

	public bachillerato(String modalidad) {
		super();
		this.modalidad = modalidad;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	@Override
	public String toString() {
		return "bachillerato [modalidad=" + modalidad + ", getFecha()=" + getFecha() + ", getCodigo()=" + getCodigo()
				+ "]";
	}
	
	

}
