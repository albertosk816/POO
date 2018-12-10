package Formula1;


public abstract class Vehiculo {
	
	//Vehiculo vehiculos[] = new Vehiculo [5];
	

	int metrosQueAvanzan;
	


	public int avanza(int metrosQueAvanza) {
	
	 metrosQueAvanza = (int) Math.round(Math.random()*47)+3;

	return metrosQueAvanza; 
    }


	@Override
	public String toString() {
		return "Vehiculo [metrosQueAvanzan=" + metrosQueAvanzan + ", getMetrosQueAvanzan()=" + getMetrosQueAvanzan()
				+ "]";
	}



	public Vehiculo(int metrosQueAvanzan) {
		super();
		this.metrosQueAvanzan = metrosQueAvanzan;
	}



	public int getMetrosQueAvanzan() {
		return metrosQueAvanzan;
	}



	public void setMetrosQueAvanzan(int metrosQueAvanzan) {
		this.metrosQueAvanzan = metrosQueAvanzan;
	}


}


