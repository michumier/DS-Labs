package encuesta;

import java.util.ArrayList;
import java.util.List;

import graficas.AccionesTV;

public class Encuesta {

	private int si, no;
	private String pregunta;
	private List<AccionesTV> acciones;

	public Encuesta(String pregunta) {
		this.pregunta = pregunta;
		this.acciones = new ArrayList<AccionesTV>();
	}

	public String getPregunta() {
		return pregunta;
	}

	public int getVotosSi() {
		return si;
	}

	public int getVotosNo() {
		return no;
	}

	public void incrementaSi() {
		si++;
		for (AccionesTV a : acciones) {
			a.actualiza(this);
		}

	}

	public void incrementaNo() {
		no++;
		for (AccionesTV a : acciones) {
			a.actualiza(this); // EL THIS SE PASA SIEMPRE EN LOS OBSERVERS
		}

	}

	public void addAction(AccionesTV ac) {
		acciones.add(ac);
	}

}
