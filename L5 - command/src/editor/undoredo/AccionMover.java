package editor.undoredo;

import editor.core.Figura;

public class AccionMover implements Accion{

	private Figura fig;
	private int x, y;
	
	public AccionMover(Figura fig, int dx, int dy) {
		this.fig = fig;
		this.x = dx;
		this.y = dy;
	}
	
	@Override
	public void redo() {
		fig.mover(x, y);
		
	}

	@Override
	public void undo() {
		fig.mover(-x, -y);
		
	}

	public Figura getFig() {
		return fig;
	}

	public void setFig(Figura fig) {
		this.fig = fig;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
