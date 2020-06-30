package de.gothaer.games.players;

public interface Player<Turn, Board> {
	
	String getName();
	Turn doTurn(Board board);

}
