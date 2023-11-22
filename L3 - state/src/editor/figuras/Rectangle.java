package editor.figuras;

import editor.Figure;
import java.awt.Point;

public class Rectangle implements Figure {
	private Point a; // vertice izq superior
	private Point b; // vertice der inferior
	public Rectangle(Point a, Point b) {
		this.a=a;
		this.b=b;
	}
	
	@Override
	public void draw() {
		System.out.println("Rectangulo creado en ("+a.getX()+","+a.getY()+") con un ancho y alto de "+
		(b.getX()-a.getX())+" y "+(b.getY()-a.getY()));
		
	}

	@Override
	public void move(Point point) {
		a.translate((int)point.getX(), (int)point.getY());
		b.translate((int)point.getX(), (int)point.getY());
	}

	@Override
	public boolean contains(Point x) {
		return (a.x <= x.x && x.x <= b.x) && (a.y <= x.y && x.y <= b.y);
	}

}
