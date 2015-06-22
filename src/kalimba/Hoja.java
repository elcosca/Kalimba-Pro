package kalimba;

import java.util.ArrayList;
import java.util.List;

public class Hoja {
	private List <Texto> textos = new ArrayList <Texto>();

	public List <Texto> getTextos() {
		return textos;
	}

	public void setTextos(List <Texto> textos) {
		this.textos = textos;
	}
	
	public void imprimir (){
		
		for (Texto texto:this.textos){
			System.out.println(this.textos.indexOf(texto));
			texto.imprimir();
		}
	}

	public void agregarTexto(Texto unTexto) {
		this.textos.add(unTexto);
	}
	

}