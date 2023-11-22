package model.elem;

import google.maps.Coordenadas;
import google.maps.Marcador;
import google.maps.Navegador;
import model.Restaurante;

public class RestauranteAdapter implements Marcador {

	private Restaurante res;
	private Navegador nav;

	public RestauranteAdapter(Restaurante res) {
		this.res = res;
		nav = new Navegador();
	}

	@Override
	public Coordenadas getCoordenadas() {
		return nav.getCoordenadas(res.getDirección());
	}

	@Override
	public String pulsaciónCorta() {
		return "Pulsado en Restaurante: Nombre y teléfono de reservas: " + res.getNombre() + " - " + res.getTeléfono();
	}

	@Override
	public void pulsaciónLarga() {
		res.llamar();
	}

}
