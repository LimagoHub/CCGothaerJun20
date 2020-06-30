package de.gothaer.games;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.gothaer.games.players.Player;

public abstract class AbstractGame<Turn, Board> implements Game {
	
	private static final String ERROR_MESSAGE = "Ungültiger Zug";
	private List<Player<Turn, Board>> players = new ArrayList<>();
	
	private Turn turn;
	private Board board;
	
	
	
	protected Turn getTurn() {
		return turn;
	}

	protected void setTurn(Turn turn) {
		this.turn = turn;
	}

	protected Board getBoard() {
		return board;
	}

	protected void setBoard(Board board) {
		this.board = board;
	}

	protected List<Player<Turn, Board>> getPlayers() {
		return Collections.unmodifiableList(players);
	}

	public void addPlayer(Player<Turn, Board> player) {
		players.add(player);
	}

	public void removePlayer(Player<Turn, Board> player) {
		players.remove(player);
	}

	@Override
	public void play() {
		while( ! isGameOver()) {
			executeTurns();
		}

	}
	
	private void executeTurns() {
		for (Player<Turn, Board> player : players) {
			executeTurnWith(player);
		}
	}
	

	private void executeTurnWith(Player<Turn, Board> player) {
		if(isGameOver()) 
			return;
		
		
		while(turnIsInvalide(player)) {
			
			display(ERROR_MESSAGE);
		}
		
		terminateTurn(player);
		
	}
	
	private boolean turnIsInvalide(Player<Turn, Board> player) {
		turn = player.doTurn(board);
		return ! isTurnValid(); 
	}
	
	private void terminateTurn(Player<Turn, Board> player) {
		updateBoard();
		displayMessageOnLosing(player);
	}
	
	
	protected void display(String message) {
		System.out.println(message);
	}
	
	protected void displayMessageOnLosing(Player<Turn, Board> player) {
		if(isGameOver())
			display(player.getName() + " hat verloren");
	}
	
	protected abstract void updateBoard();
	
	protected abstract boolean isGameOver();
	protected abstract boolean isTurnValid();

	
}
