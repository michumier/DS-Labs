package model.elem;

import google.maps.Coordenadas;
import google.maps.Marcador;
import google.maps.Navegador;
import model.Monumento;

public class MonumentoAdapter implements Marcador{
	
	private Monumento mon;
	private Navegador nav;
	

	public MonumentoAdapter(Monumento mon) {
		this.mon = mon;
		nav = new Navegador();
	}

	@Override
	public Coordenadas getCoordenadas() {
		return nav.getCoordenadas(mon.getDirección());
	}

	@Override
	public String pulsaciónCorta() {
		return "Pulsado en Monumento: Nombre y autor del monumento: " + mon.getNombre() + " - " + mon.getAutor();
	}

	@Override
	public void pulsaciónLarga() {
		nav.navegarHasta(mon.getDirección());
		
	}

}
