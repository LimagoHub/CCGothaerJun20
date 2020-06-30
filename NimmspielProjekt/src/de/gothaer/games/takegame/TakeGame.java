package de.gothaer.games.takegame;

import java.util.Scanner;

import de.gothaer.games.Game;

public class TakeGame implements Game {
	private static final String ERROR_MESSAGE = "Ungültiger Zug";
	private static final String USERPROMPT = "Es gibt %s Steine. Bitte nehmen Sie 1,2 oder 3.";
	private Scanner scanner = new Scanner(System.in);
	private int stones;
	private int turn;
	
	public TakeGame() {
		stones = 23;
		
	}

	@Override
	public void play() {
		while( ! isGameOver()) {
			executeTurns();
		}
	}

	private boolean isGameOver() {
		return stones < 1;
	}
	
	
	private void executeTurns() {
		humanTurn();
		computerTurn();
	}

	private void humanTurn() {
		if(isGameOver()) 
			return;
		
		
		while(true) {
			System.out.println(String.format(USERPROMPT, stones));
			turn =scanner.nextInt();
			if(turn >= 1 && turn <= 3) break;
			System.out.println(ERROR_MESSAGE);
		}
		
		terminateTurn("Spieler");
		
	}

	private void computerTurn() {
		if(isGameOver())
			return;
		
		
		final int zuege [] = {3,1,1,2};
		turn = zuege[stones % 4];
		System.out.println(String.format("Ich nehme %s Steine.", turn));
		
		terminateTurn( "Computer");
		
	}

	private void terminateTurn(String spieler) {
		updateBoard();
		displayMessageOnLosing(spieler);
	}

	private void updateBoard() {
		stones -= turn;
	}

	private void displayMessageOnLosing(String spieler) {
		if(stones < 1) {
			System.out.println(spieler + " hat verloren");
		}
	}

}
