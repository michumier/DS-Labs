package platform.playstation;

import java.awt.Point;

import platform.Image2D;
import platform.Plataforma;
import platform.android.AndroidAPI;

public class Playstation5Adapter implements Plataforma {

	private Playstation5API api = new Playstation5API();
	
	@Override
	public Point getPosition() {
		return api.getJoystick();

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

