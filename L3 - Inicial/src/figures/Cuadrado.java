package figures;

import java.awt.Point;

public class Cuadrado implements Figura {

	private Point inicio;
	private Point fin;
	private int ancho, largo;

	public Cuadrado(int x1, int y1, int x2, int y2) {
		inicio = new Point(x1, y1);
		fin = new Point(x2, y2);
		ancho = x2-x1;
		largo = y2-y1;
	}

	@Override
	public void show() {
		System.out.println("Cuadrado: x1: " + inicio.x +" , y1: " + inicio.y + 
				" , x2: "+ fin.x  +  ", y2: " + fin.y + 
				" , ancho: " + ancho + " , largo: " + largo);
	}

}
