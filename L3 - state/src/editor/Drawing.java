package editor;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Drawing  
{
	//Dibujo sobre el que estan las figuras, por tanto, debera tener una lista con las figuras
	private List<Figure> figures;
	
	public Drawing() {
		figures = new ArrayList<Figure>();
	}
	
	public void addFigure(Figure figure) {
		figures.add(figure);
	}
	public void draw()
	{
		for (Figure figure : figures) {
			figure.draw();
		}
	}

	public Figure getFigura(Point x) {
		for(Figure figure: figures) {
			if(figure.contains(x)) {
				return figure;
			}
		}
		return null;
	}
}
