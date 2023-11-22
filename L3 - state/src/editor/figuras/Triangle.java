package editor.figuras;

import editor.Figure;
import java.awt.Point;

public class Triangle implements Figure {
	
	private Point p1;
	private Point p2;
	private Point p3;
	
	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	@Override
	public void draw() {
		System.out.println("Triangulo creado con los vertices en ("+p1+"),("+p2+"),("+p3+")");		
	}

	@Override
	public void move(Point point) {
		p1.translate((int)point.getX(), (int)point.getY());
		p2.translate((int)point.getX(), (int)point.getY());
		p3.translate((int)point.getX(), (int)point.getY());
	}

	@Override
	public boolean contains(Point x) {
		return x.equals(p1)||x.equals(p2)||x.equals(p3);
	}

}
