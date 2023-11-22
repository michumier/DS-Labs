package platform.android;

import java.awt.Point;

import platform.Image2D;
import platform.Plataforma;

public class AndroidAdapter implements Plataforma {

	private AndroidAPI api = new AndroidAPI();
	
	@Override
	public Point getPosition() {
		return api.getTouch();

	}

	@Override
	public Image2D load(String file) {
		return api.loadResource(file);
	}

	@Override
	public void draw(Image2D image, Point point) {
		api.draw(point.x, point.y, image);
	}

}
