package editor.herramientas;

import java.awt.Point;

import editor.Editor;
import editor.Figure;
import editor.figuras.Rectangle;

public class RectangleCreationTool extends CreationTool {
	
	public RectangleCreationTool(Editor editor) {
		super(editor);
	}
	
	@Override
	protected Figure createFigure(Point inicio, Point fin) {
		return new Rectangle(inicio, fin);
	}

	@Override
	protected Figure createFigureT(Point p1, Point p2, Point p3) {
		// TODO Auto-generated method stub
		return null;
	}

}
