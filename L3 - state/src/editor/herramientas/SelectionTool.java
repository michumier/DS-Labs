package editor.herramientas;

import java.awt.Point;

import editor.Editor;
import editor.Figure;
import editor.Tool;

public class SelectionTool implements Tool {
	
	private Point pos;
	private Editor editor;
	private Figure selected;
	
	public SelectionTool(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void pinchar(Point x) {
		selected = editor.getDrawing().getFigura(x);
		pos = x;		
	}

	@Override
	public void mover(Point x) {
		calculateMove(x);		
	}

	@Override
	public void soltar() {
		
	}
	
	private void calculateMove(Point point) {
		if(selected!=null) {
			int x = (int) (point.getX()-pos.getX());
			int y = (int) (point.getY()-pos.getY());
			Point newPos = new Point(x,y);
			selected.move(newPos);
		}
	}

}
