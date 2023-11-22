package editor.herramientas;

import java.awt.Point;

import editor.Editor;
import editor.Figure;
import editor.Tool;

public abstract class CreationTool implements Tool{
	private Point inicio;
	private Point fin;
	private Editor editor;
	
	public CreationTool(Editor editor) {
		this.editor = editor;
	}
	@Override
	public void pinchar(Point x) {
		inicio = x;		
	}

	@Override
	public void mover(Point x) {
		fin = x;		
	}

	@Override
	public void soltar() {
		editor.getDrawing().addFigure(createFigure(inicio,fin));
	}
	
	protected abstract Figure createFigure(Point inicio, Point fin);
	protected abstract Figure createFigureT(Point p1, Point p2, Point p3);

}
