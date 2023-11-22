package editor.herramientas;

import java.awt.Point;

import editor.Editor;
import editor.Figure;
import editor.figuras.Circle;

public class CircleCreationTool extends CreationTool{
	
	public CircleCreationTool(Editor editor) {
		super(editor);
	}

	@Override
	protected Figure createFigure(Point inicio, Point fin) {
		double distancia = Math.sqrt(Math.pow(fin.getX() - inicio.getX(), 2)
					+ Math.pow(fin.getY() - inicio.getY(), 2));
		
		return new Circle(inicio,distancia);
	}

	@Override
	protected Figure createFigureT(Point p1, Point p2, Point p3) {
		// TODO Auto-generated method stub
		return null;
	}

}
