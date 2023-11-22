package graficas;

import encuesta.Encuesta;

public class IntervaloVotos implements AccionesTV{
	
	private int cont;
	private AccionesTV act;
	

	public IntervaloVotos(int cont, AccionesTV act) {
		this.cont = cont;
		this.act = act;
	}

	@Override
	public void actualiza(Encuesta encuesta) {
		int votos = encuesta.getVotosNo() + encuesta.getVotosSi();
		if(votos % cont == 0) {
			act.actualiza(encuesta);
		}
		
	}

}

