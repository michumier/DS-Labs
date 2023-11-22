package figuras.triangulo;

import java.awt.Point;

import editor.core.*;

public class HerramientaTriangulo implements Herramienta {
    public HerramientaTriangulo(Editor editor) {
        this.editor = editor;
    }

    public void pinchar(int x, int y) {
        vertice[vertices++] = new Point(x, y);
        if (vertices == 3) {
            Figura figura = new Triangulo(vertice[0], vertice[1], vertice[2]);
            editor.getDibujo().addFigura(figura);
            vertices = 0;
            editor.finHerramienta();
        }
    }

    public void mover(int x, int y) {
        // No es necesario hacer nada
    }

    public void soltar(int x, int y) {
        // No es necesario hacer nada
    }

    private int vertices = 0;
    private Point[] vertice = new Point[3];
    private Editor editor;
}
