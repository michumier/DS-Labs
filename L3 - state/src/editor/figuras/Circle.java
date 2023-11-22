package editor.figuras;

import java.awt.Point;

import editor.Figure;

public class Circle implements Figure{
	
	private Point center;
	private double radio;
	
	public Circle(Point center, double radio) {
		this.center = center;
		this.radio = radio;
	}
	

	@Override
	public void draw() {
		System.out.println("Circulo creado con radio en ("+center.getX()+","+center.getY()+")"+
				" y con un radio de "+radio);		
	}


	@Override
	public void move(Point point) {
		center.translate((int)point.getX(), (int)point.getY());
	}


	@Override
	public boolean contains(Point x) {
		double distancia = Math.sqrt(Math.pow(x.x - center.x, 2) + Math.pow(x.y - center.y, 2));
        return distancia < radio;
	}

}
