package Formula1;

public  class Motos extends Vehiculo {
	

	String nombre = "moto";



@Override
	public String toString() {
		return "Motos [nombre=" + nombre + ", turno=" + turno + ", avanza()=" + avanza() + ", toString()="
				+ super.toString() + ", getPosicion()=" + getPosicion() + "]";
	}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}

	
public void paint(){
	
}
	
}




