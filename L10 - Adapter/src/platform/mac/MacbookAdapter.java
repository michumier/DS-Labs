package platform.mac;

import java.awt.Point;

import platform.Image2D;
import platform.Plataforma;
import platform.playstation.Playstation5API;

public class MacbookAdapter implements Plataforma {

	private MacbookAPI api = new MacbookAPI();
	
	@Override
	public Point getPosition() {
		return api.getMouse();

	}

	@Override
	public Image2D load(String file) {
		return api.loadGraphics(file);
	}

	@Override
	public void draw(Image2D image, Point point) {
		api.render(point.x, point.y, image);
	}

}

