package figures;

import java.awt.Point;

public class Circulo implements Figura {

	private int radio;
	private Point centro;
	
	public Circulo(int x, int y, int rad) {
		centro = new Point(x,y);
		radio = rad;
	}
	
	@Override
	public void show() {
		System.out.println("Circulo: x: " + centro.x + " , y: " + centro.y + " , radio: " + radio);
	}

}
