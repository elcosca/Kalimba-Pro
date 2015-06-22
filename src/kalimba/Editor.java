package kalimba;

import java.util.List;
import java.util.ArrayList;

public class Editor {
     private Texto portaPapeles;
     private Hoja hojaActiva;
     private List <Hoja> hojas = new ArrayList<Hoja>();
	
     //Texto
     public Texto getPortaPapeles() {
		return portaPapeles;
	}
	public void setPortaPapeles(Texto portaPapeles) {
		this.portaPapeles = portaPapeles;
	}
	
	//Hoja
	public Hoja getHojaActiva() {
		return hojaActiva;
	}
	public void setHojaActiva(Hoja hojaActiva) {
		this.hojaActiva = hojaActiva;
	}
	
	//lista hojas
	public List<Hoja> getHojas() {
		return hojas;
	}
	public void setHojas(List<Hoja> hojas) {
		this.hojas = hojas;
	}
	
	public void imprimirHA(){
		this.hojaActiva.imprimir();
	}
	
	public void copiar(Integer posicion){
		Texto nuevoTexto = new Texto();
		nuevoTexto.setContenido(this.hojaActiva.getTextos().get(posicion).getContenido());
		this.portaPapeles = nuevoTexto;
				
	}
	
	public void pegar(Hoja hoja){
		hoja.agregarTexto(this.portaPapeles);
	}
}