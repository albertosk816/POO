package Ejercicio02;

public class fp extends Matricula {
	
	private boolean dual;

	public fp() {
		super();
	}

	public fp(boolean dual) {
		super();
		this.dual = dual;
	}

	public boolean isDual() {
		return dual;
	}

	public void setDual(boolean dual) {
		this.dual = dual;
	}

	@Override
	public String toString() {
		return "fp [dual=" + dual + ", getFecha()=" + getFecha() + ", getCodigo()=" + getCodigo() + "]";
	}
	
	

}
