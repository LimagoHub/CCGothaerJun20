package de.gothaer.games.takegame;

import de.gothaer.games.AbstractGame;

public class TakeGame extends AbstractGame<Integer, Integer> {
	

	
	public TakeGame() {
		setBoard(23);
	}

	
	
	protected boolean isTurnValid() {
		return getTurn() >= 1 && getTurn() <= 3;
	}

	protected void updateBoard() {
		setBoard(getBoard() - getTurn());
	}

	
	
	
	protected boolean isGameOver() {
		return getBoard() < 1 || getPlayers().isEmpty();
	}

}
