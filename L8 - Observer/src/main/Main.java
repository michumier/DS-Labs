package main;

import java.io.IOException;

import encuesta.Encuesta;
import encuesta.TextUserInterface;
import graficas.Backup;
import graficas.GraficoBarras;
import graficas.GraficoCircular;
import graficas.IntervaloVotos;
import graficas.LineaEstado;
import graficas.MinimoVotos;

public class Main {

	public static void main(String[] args) throws IOException {
		main2();
	}

	// MISMO PERO CON LINEAESTADO
	public static void main2() throws IOException {
		Encuesta encuesta = new Encuesta("¿Está a favor de la energia nuclear?");
		encuesta.addAction(new GraficoBarras());
		encuesta.addAction(new Backup());
		encuesta.addAction(new GraficoCircular());
		encuesta.addAction(new LineaEstado());

		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(encuesta);
	}

	// AHORA SIN GRAFICO DE BARRAS
	public static void main3() throws IOException {
		Encuesta encuesta = new Encuesta("¿Está a favor de la energia nuclear?");
		encuesta.addAction(new Backup());
		encuesta.addAction(new GraficoCircular());
		encuesta.addAction(new LineaEstado());

		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(encuesta);
	}

	// SOLO MUESTRA GRAFICO CIRCULAR A PARTIR DEL TERCER VOTO
	public static void main4() throws IOException {
		Encuesta encuesta = new Encuesta("¿Está a favor de la energia nuclear?");
		encuesta.addAction(new Backup());
		encuesta.addAction(new MinimoVotos(3, new GraficoCircular()));
		encuesta.addAction(new LineaEstado());

		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(encuesta);
	}


	// SOLO MUESTRA GRAFICO CIRCULAR A PARTIR DEL CUARTO VOTO Y CADA DOS LUEGO
	public static void main6() throws IOException {
		Encuesta encuesta = new Encuesta("¿Está a favor de la energia nuclear?");
		encuesta.addAction(new Backup());
		encuesta.addAction(new MinimoVotos(3, new IntervaloVotos(2, new GraficoCircular())));
		encuesta.addAction(new LineaEstado());
		
		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(encuesta);
	}

}
