package de.gothaer.games.takegame.players;

import de.gothaer.games.players.AbstractPlayer;

public class ComputerPlayer extends AbstractPlayer<Integer,Integer>{
	private static final int  [] ZUEGE = {3,1,1,2};
	
	public ComputerPlayer() {
		super();
	}

	public ComputerPlayer(String name) {
		super(name);
	}

	@Override
	public Integer doTurn(Integer stones) {
		int turn = ZUEGE[stones % 4];
		display(String.format("Ich nehme %s Steine.", turn));
		return turn;
	}
	
	

}
