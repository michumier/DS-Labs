package game.ballgames;

import java.awt.Point;

import game.BallGame;
import platform.Image2D;
import platform.windows.WindowsAPI;

public class BGWindows extends BallGame{

	
private WindowsAPI api = new WindowsAPI();
	
	public Point getPosition() {
		return api.getMouseClick();

	}

	public Image2D loadImage(String file) {
		return api.loadFile(file);
	}

	public void drawBall(Image2D image, Point point) {
		api.paint(point.x, point.y, image);
	}

}
