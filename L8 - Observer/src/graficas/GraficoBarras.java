package graficas;

import encuesta.Encuesta;

public class GraficoBarras implements AccionesTV{

	@Override
	public void actualiza(Encuesta encuesta) {
		System.out.println("Aquí se dibujaría el gráfico de barras.");		
	}

}
