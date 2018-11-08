package Ejercicio02;

public class eso extends Matricula {
	
	private boolean pmar;

	public eso() {
		super();
	}

	public eso(boolean pmar) {
		super();
		this.pmar = pmar;
	}

	public boolean isPmar() {
		return pmar;
	}

	public void setPmar(boolean pmar) {
		this.pmar = pmar;
	}

	@Override
	public String toString() {
		return "eso [pmar=" + pmar + ", getFecha()=" + getFecha() + ", getCodigo()=" + getCodigo() + "]";
	}
	
	

}
