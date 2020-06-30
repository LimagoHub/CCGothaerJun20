package de.gothaer.games.players;

public abstract class AbstractPlayer<Turn, Board> implements Player<Turn, Board> {
	
	private String name = getClass().getSimpleName();
	
	public AbstractPlayer() {
		// Ok
	}

	public AbstractPlayer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
	
	protected void display(String message) {
		System.out.println(message);
		
	}


}
