package graficas;

import encuesta.Encuesta;

public class Backup implements AccionesTV {


	@Override
	public void actualiza(Encuesta encuesta) {
		System.out.println("Aquí se guardarán los datos en disco/BD.");

	}

}
