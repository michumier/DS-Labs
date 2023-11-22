package editor;

import java.util.*;

import figures.Figura;

public class Dibujo {

	private List<Figura> listado;
	
	public Dibujo() {
		listado = new ArrayList();
	}
	
	public void addFigura(Figura fig) {
		listado.add(fig);
		
	}
	

	public void dibujar() {
		for(int i=0;i<listado.size();i++) {
			listado.get(i).show();
		}
	}

}
