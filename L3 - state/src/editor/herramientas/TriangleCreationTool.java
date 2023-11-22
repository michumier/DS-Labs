package editor.herramientas;

import java.awt.Point;

import editor.Editor;
import editor.Figure;
import editor.Tool;
import editor.figuras.Rectangle;
import editor.figuras.Triangle;

public class TriangleCreationTool extends CreationTool {
	private Editor editor;
	private int numVert;
	private Point[] vert;

	public TriangleCreationTool(Editor editor) {
		super(editor);
	}

	@Override
	public void pinchar(Point point) {
		vert[numVert] = point;
		numVert++;
		if (numVert == 3) {
			editor.getDrawing().addFigure(new Triangle(vert[0], vert[1], vert[2]));
		}

	}

	@Override
	protected Figure createFigureT(Point p1, Point p2, Point p3) {
		return new Triangle(p1, p2, p3);

	}

	@Override
	protected Figure createFigure(Point inicio, Point fin) {
		// TODO Auto-generated method stub
		return null;
	}



	
}
