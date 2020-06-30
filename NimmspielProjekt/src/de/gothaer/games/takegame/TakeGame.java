package de.gothaer.games.takegame;

import java.util.Scanner;

import de.gothaer.games.Game;

public class TakeGame implements Game {
	private static final String ERROR_MESSAGE = "Ungültiger Zug";
	private static final String USERPROMPT = "Es gibt %s Steine. Bitte nehmen Sie 1,2 oder 3.";
	private Scanner scanner = new Scanner(System.in);
	private int stones;
	private boolean gameover;
	
	public TakeGame() {
		stones = 23;
		gameover = false;
	}

	@Override
	public void play() {
		while( ! gameover) {
			executeTurns();
		}
	}

	private void executeTurns() {
		humanTurn();
		computerTurn();
	}

	private void humanTurn() {
		int turn;
		while(true) {
			System.out.println(String.format(USERPROMPT, stones));
			turn =scanner.nextInt();
			if(turn >= 1 && turn <= 3) break;
			System.out.println(ERROR_MESSAGE);
		}
		stones -= turn;
		
	}

	private void computerTurn() {
		int turn;
		final int zuege [] = {3,1,1,2};
		
		if(stones < 1) {
			System.out.println("Du Loser");
			gameover = true;
			return;
		}
		
		if(stones == 1) {
			System.out.println("Du hast nur Glück gehabt");
			gameover = true;
			return;
		}
		
		turn = zuege[stones % 4];
		System.out.println(String.format("Ich nehme %s Steine.", turn));
		stones -= turn;
		
	}

}
