package de.application;

import de.gothaer.client.GameClient;
import de.gothaer.games.Game;
import de.gothaer.games.takegame.TakeGame;

public class Main {

	public static void main(String[] args) {
		Game game = new TakeGame();
		GameClient client = new GameClient(game);
		client.run();

	}

}
