package de.application;

import de.gothaer.client.GameClient;
import de.gothaer.games.Game;
import de.gothaer.games.takegame.TakeGame;
import de.gothaer.games.takegame.players.ComputerPlayer;
import de.gothaer.games.takegame.players.HumanPlayer;

public class Main {

	public static void main(String[] args) {
		TakeGame game = new TakeGame();
		game.addPlayer(new HumanPlayer());
		game.addPlayer(new ComputerPlayer());
		GameClient client = new GameClient(game);
		client.run();

	}

}
