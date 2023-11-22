package graficas;

import encuesta.Encuesta;

public class LineaEstado implements AccionesTV{

	@Override
	public void actualiza(Encuesta encuesta) {
		System.out.println(" -> SI: " + encuesta.getVotosSi());
		System.out.println(" -> NO: " + encuesta.getVotosNo());
		
	}

}
