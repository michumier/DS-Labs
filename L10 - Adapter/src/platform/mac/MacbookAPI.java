package platform.mac;

import java.awt.Point;

import platform.Image2D;

public class MacbookAPI {

	
	public Image2D loadGraphics(String name) {
		System.out.println("(Macbook) Cargada imagen '" + name + "' del DVD.");
		return new Image2D(name, 10, 10);
	}

	public void render(int x, int y, Image2D image) {
		System.out.println("(Macbook) Dibujando '" + image.getName() + "' en [" + x + "," + y + "]");
	}

	// Posici�n del stick en la que el usuario pulsa el bot�n X 
	public Point getMouse() {
		point.translate(10, 10);
		return new Point(point);
	}

	private Point point = new Point(0, 0);
}
