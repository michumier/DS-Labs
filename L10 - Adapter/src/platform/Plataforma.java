package platform;

import java.awt.Point;

public interface Plataforma {

	public Image2D load(String file);
	public Point getPosition();
	public void draw(Image2D image, Point point);
}
