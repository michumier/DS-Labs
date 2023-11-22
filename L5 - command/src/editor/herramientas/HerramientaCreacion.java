package editor.herramientas;

import java.awt.Point;

import editor.core.Editor;
import editor.core.Figura;
import editor.core.Herramienta;
import editor.undoredo.AccionCrear;

public abstract class HerramientaCreacion implements Herramienta {

    protected HerramientaCreacion(Editor editor) {
        this.editor = editor;
    }

    public void pinchar(int x, int y) {
        inicio = new Point(x, y);
    }

    public void mover(int x, int y) {
    }

    public void soltar(int x, int y) {
        fin = new Point(x, y);
        Figura figura = doCreaFigura(inicio, fin);
        editor.getDibujo().addFigura(figura);
        editor.getManager().addUndo(new AccionCrear(figura, editor.getDibujo()));
        editor.finHerramienta();
    }

    protected abstract Figura doCreaFigura(Point inicio, Point fin);

    protected Editor editor;
    private Point inicio, fin;
}
