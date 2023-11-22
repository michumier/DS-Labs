package editor.undoredo;

import editor.core.Dibujo;
import editor.core.Figura;

public class AccionCrear implements Accion{
	
	private Figura fig;
	private Dibujo dib;
	

	public AccionCrear(Figura fig, Dibujo dib) {
		this.fig = fig;
		this.dib = dib;
	}

	@Override
	public void redo() {
		dib.addFigura(fig);
		
	}

	@Override
	public void undo() {
		dib.removeFigura(fig);
		
	}

}