package pr1.game.main;

import pr1.main.GameWindows;

public class Main {
	public static void main(String[] args) {
	 GameWindows frame = new GameWindows("pr1", 1280, 720);
	 frame.setFullScreenMode(0);
	 frame.setVisible(true);
	}
}