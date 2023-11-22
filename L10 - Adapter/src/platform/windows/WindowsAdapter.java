package platform.windows;

import java.awt.Point;

import platform.Image2D;
import platform.Plataforma;
import platform.playstation.Playstation5API;

public class WindowsAdapter implements Plataforma {

	private WindowsAPI api = new WindowsAPI();
	
	@Override
	public Point getPosition() {
		return api.getMouseClick();

	}

	@Override
	public Image2D load(String file) {
		return api.loadFile(file);
	}

	@Override
	public void draw(Image2D image, Point point) {
		api.paint(point.x, point.y, image);
	}

}


