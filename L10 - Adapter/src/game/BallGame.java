package game;

import java.awt.Point;

import platform.*;
import platform.android.*;
import platform.playstation.*;
import platform.windows.*;

/* Esta clase/paquete ser�a el c�digo del videojuego, el cual se quiere reutilizar
 * en las distintas plataformas 
 */



public class BallGame {

	
	private Plataforma p;

	public BallGame(Plataforma p) {
		this.p = p;
	}

	public void play() {

		Image2D image = loadImage("Bola.jpg");

		// L�gica principal del juego
		for (int i = 0; i < 10; i++) {
			Point point = getPosition();
			// Comprobar colisiones...
			// Imprimir marcador...
			// Otra l�gica del juego...
			drawBall(image, point);
			loadImage("file.txt");
			System.out.println(getPosition().x + " - " + getPosition().y);
		}
	}

	private Image2D loadImage(String file) {
//		Image2D image;
//		if (platform == Platform.ANDROID)
//			image = android.loadResource(file);
//		else if (platform == Platform.WINDOWS)
//			image = windows.loadFile(file);
//		else
//			image = playstation.loadGraphics(file);
//		
//		image = null;
		return p.load(file);
	}

	private void drawBall(Image2D image, Point point) {
//		if (platform == Platform.ANDROID)
//			android.draw(point.x, point.y, image);
//		else if (platform == Platform.WINDOWS)
//			windows.paint(point.x, point.y, image);
//		else
//			playstation.render(point.x, point.y, image);
		
		p.draw(image, point);
	}

	private Point getPosition() {
//		Point point;
//		if (platform == Platform.ANDROID)
//			point = android.getTouch();
//		else if (platform == Platform.WINDOWS)
//			point = windows.getMouseClick();
//		else
//			point = playstation.getJoystick();
//		return point;
		
		return p.getPosition();
	}
}
