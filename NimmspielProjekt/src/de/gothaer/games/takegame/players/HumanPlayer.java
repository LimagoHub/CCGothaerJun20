package de.gothaer.games.takegame.players;

import java.util.Scanner;

import de.gothaer.games.players.AbstractPlayer;

public class HumanPlayer extends AbstractPlayer<Integer, Integer> {
	
	private static final String USERPROMPT = "Es gibt %s Steine. Bitte nehmen Sie 1,2 oder 3.";
	private Scanner scanner = new Scanner(System.in);
	

	public HumanPlayer() {
		super();
	}

	public HumanPlayer(String name) {
		super(name);
	}

	@Override
	public Integer doTurn(Integer stones) {
		display(String.format(USERPROMPT, stones));
		return scanner.nextInt();
	}

	

}
