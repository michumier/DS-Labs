package game.ballgames;

import java.awt.Point;

import game.BallGame;
import platform.Image2D;
import platform.android.AndroidAPI;

public class BGAndroid extends BallGame{

private AndroidAPI api = new AndroidAPI();
	
	public Point getPosition() {
		return api.getTouch();

	}

	@Override
	public Image2D loadImage(String file) {
		return api.loadResource(file);

	}

	@Override
	public void drawBall(Image2D image, Point point) {
		api.draw(point.x, point.y, image);		
	}
}
