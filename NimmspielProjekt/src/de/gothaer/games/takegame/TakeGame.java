package de.gothaer.games.takegame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import de.gothaer.games.Game;
import de.gothaer.games.takegame.players.TakeGamePlayer;

public class TakeGame implements Game {
	private static final String ERROR_MESSAGE = "Ungültiger Zug";
	private List<TakeGamePlayer> players = new ArrayList<>();
	
	private int stones;
	private int turn;
	
	public TakeGame() {
		stones = 23;
	}

	public void addPlayer(TakeGamePlayer player) {
		players.add(player);
	}
	

	public void removePlayer(TakeGamePlayer player) {
		players.remove(player);
	}
	

	@Override
	public void play() {
		while( ! isGameOver()) {
			executeTurns();
		}
	}

	
	
	
	private void executeTurns() {
		for (TakeGamePlayer player : players) {
			executeTurnWith(player);
		}
	}

	private void executeTurnWith(TakeGamePlayer player) {
		if(isGameOver()) 
			return;
		
		
		while(turnIsInvalide(player)) {
			
			display(ERROR_MESSAGE);
		}
		
		terminateTurn(player.getName());
		
	}
	

	private boolean turnIsInvalide(TakeGamePlayer player) {
		turn = player.doTurn(stones);
		return ! isTurnValid(); 
	}
	
	private void terminateTurn(String spieler) {
		updateBoard();
		displayMessageOnLosing(spieler);
	}
	

	
	private void display(String message) {
		System.out.println(message);
	}
	
	private boolean isTurnValid() {
		return turn >= 1 && turn <= 3;
	}

	private void updateBoard() {
		stones -= turn;
	}

	private void displayMessageOnLosing(String spieler) {
		if(stones < 1) {
			display(spieler + " hat verloren");
		}
	}
	
	
	private boolean isGameOver() {
		return stones < 1;
	}

}
