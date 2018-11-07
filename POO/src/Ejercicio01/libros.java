package Ejercicio01;

public class libros extends antiguedades {
	
	private String autor;
	private String titulo;
	
	
	
	
	public libros() {
		super();
	}




	public libros(int annoFabricacion, String origen, float precio, String autor, String titulo) {
		super(annoFabricacion, origen, precio);
		this.autor = autor;
		this.titulo = titulo;
		
		
	}




	public String getAutor() {
		return autor;
	}




	public void setAutor(String autor) {
		this.autor = autor;
	}




	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	@Override
	public String toString() {
		return "libros [autor=" + autor + ", titulo=" + titulo + ", getAnoFabricacion()=" + getAnoFabricacion()
				+ ", getOrigen()=" + getOrigen() + ", getPrecio()=" + getPrecio() + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
