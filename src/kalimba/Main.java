package kalimba;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Creo un texto
		Texto texto = new Texto();
		texto.setContenido("Hola mundo !!!");
		
		// Creo otro texto
		Texto texto2 = new Texto();
		texto2.setContenido("Hola !!!");
		
		// Creo la lista de texto de la hoja
		List <Texto> textos = new ArrayList <Texto> ();
		
		// Agrego los textos a la lista de la hoja
		textos.add(texto);
		textos.add(texto2);
		
		// Creo una hoja y le seteo la lista de textos
		Hoja hoja1 = new Hoja();
		hoja1.setTextos(textos);
		
		// Imprimo la hoja
        //hoja1.imprimir();
		
		Editor editor = new Editor();
		List <Hoja> hojas = new ArrayList<Hoja>();
		hojas.add(hoja1);
		
		editor.setHojaActiva(hoja1);
		editor.setHojas(hojas);
		
		editor.imprimirHA();
		System.out.println("######################");
		editor.copiar(new Integer(0));
		editor.imprimirHA();
		System.out.println("######################");
		editor.pegar(editor.getHojaActiva());
		editor.imprimirHA();

	}

}