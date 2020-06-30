package de.gothaer.games.takegame.players;

public class ComputerPlayer extends AbstractTakeGamePlayer{
	private final int zuege [] = {3,1,1,2};
	
	public ComputerPlayer() {
		super();
	}

	public ComputerPlayer(String name) {
		super(name);
	}

	@Override
	public int doTurn(int stones) {
		int turn = zuege[stones % 4];
		display(String.format("Ich nehme %s Steine.", turn));
		return turn;
	}
	
	

}
