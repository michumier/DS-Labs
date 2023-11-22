package model.elem;

import google.maps.Coordenadas;
import google.maps.Marcador;
import model.Foto;

public class FotoAdapter implements Marcador {
	
	private Foto foto;
	
	public FotoAdapter(Foto f) {
		this.foto = f;
	}

	@Override
	public Coordenadas getCoordenadas() {
		return foto.getCoordenadas();
	}

	@Override
	public String pulsaciónCorta() {
		return "Pulsado en Foto: Usuario que la ha subido y descripción de la foto: " + foto.getUsuario() + " - "
				+ foto.getDescripción();
	}

	@Override
	public void pulsaciónLarga() {
		foto.descargar();
		
	}

}
