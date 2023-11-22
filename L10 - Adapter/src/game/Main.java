package game;

import platform.android.AndroidAdapter;
import platform.playstation.Playstation5Adapter;

public class Main {
	public static void main(String[] args) {
		BallGame gameAndroid = new BallGame(new AndroidAdapter());
		gameAndroid.play();
		
		BallGame gamePS5 = new BallGame(new Playstation5Adapter());
		gamePS5.play();
	}
}
