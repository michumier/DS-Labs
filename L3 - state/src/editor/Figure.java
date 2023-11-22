package editor;

import java.awt.Point;

public interface Figure {
	
	public void draw(); // cada figura debe saber dibujarse a si misma

	public void move(Point point);

	public boolean contains(Point x);
}
