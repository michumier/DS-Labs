package game;

import game.ballgames.BGAndroid;
import game.ballgames.BGPlaystation;

public class Main {
	public static void main(String[] args) {
		
		BGAndroid game = new BGAndroid();
		game.play();
		
		BGPlaystation game2 = new BGPlaystation();
		game2.play();
	}
}
