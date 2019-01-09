package Formula1;

public class Coches extends Vehiculo {



	String nombre = "coche";
	
	
	@Override
	public String toString() {
		return "Coches [nombre=" + nombre + ", posicion=" + posicion + ", turno=" + turno + ", avanza()=" + avanza()
				+ "]";
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
