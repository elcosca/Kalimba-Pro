package kalimba;

public class Texto {
	
	private String contenido;

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public void imprimir(){
		System.out.println(this.contenido);
	}
}