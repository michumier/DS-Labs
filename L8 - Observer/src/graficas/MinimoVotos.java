package graficas;

import encuesta.Encuesta;

public class MinimoVotos implements AccionesTV{
	
	private int cont;
	private AccionesTV act;
	

	public MinimoVotos(int cont, AccionesTV act) {
		this.cont = cont;
		this.act = act;
	}

	@Override
	public void actualiza(Encuesta encuesta) {
		if(encuesta.getVotosNo() + encuesta.getVotosSi() >= cont) {
			act.actualiza(encuesta);
		}
		
	}

}
