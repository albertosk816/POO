package Formula1;


public  class Vehiculo {
	
	

	
	int posicion = 0;
	int turno = 1;



	public int avanza() {
	
	 int metrosQueAvanza = (int) Math.round(Math.random()*47)+3;

	 return metrosQueAvanza;
    }
	



	@Override
	public String toString() {
		return "Vehiculo [posicion=" + posicion + ", turno=" + turno + ", avanza()=" + avanza() + ", getPosicion()="
				+ getPosicion() + ", getTurno()=" + getTurno() + "]";
	}




	public int getPosicion() {
		return posicion;
	}




	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}




	public int getTurno() {
		return turno;
	}




	public void setTurno(int turno) {
		this.turno = turno;
	}



}


