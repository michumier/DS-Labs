package game.ballgames;

import java.awt.Point;

import game.BallGame;
import platform.Image2D;
import platform.playstation.Playstation5API;

public class BGPlaystation extends BallGame{

private Playstation5API api = new Playstation5API();
		

	public Point getPosition() {
		return api.getJoystick();

	}

	public Image2D loadImage(String file) {
		return api.loadGraphics(file);
	}

	public void drawBall(Image2D image, Point point) {
		api.render(point.x, point.y, image);
	}

}
