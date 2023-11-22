package figures;

import java.awt.Point;

public class Triangulo implements Figura {

	private Point p1, p2, p3;

	public Triangulo(int x1, int y1, int x2, int y2, int x3, int y3) {
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
		p3 = new Point(x3, y3);

	}

	@Override
	public void show() {
		System.out.println("Triangulo: ");

	}

}
