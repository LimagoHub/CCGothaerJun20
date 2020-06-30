package de.gothaer.games.takegame.players;

import java.util.Scanner;

public class HumanPlayer extends AbstractTakeGamePlayer {
	
	private static final String USERPROMPT = "Es gibt %s Steine. Bitte nehmen Sie 1,2 oder 3.";
	private Scanner scanner = new Scanner(System.in);
	

	public HumanPlayer() {
		super();
	}

	public HumanPlayer(String name) {
		super(name);
	}

	@Override
	public int doTurn(int stones) {
		display(String.format(USERPROMPT, stones));
		return scanner.nextInt();
	}

	

}
