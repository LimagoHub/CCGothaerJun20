package de.gothaer.games.takegame.players;

public abstract class AbstractTakeGamePlayer implements TakeGamePlayer{
	
	private String name = getClass().getSimpleName();
	
	public AbstractTakeGamePlayer() {
		
	}

	public AbstractTakeGamePlayer(String name) {
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
