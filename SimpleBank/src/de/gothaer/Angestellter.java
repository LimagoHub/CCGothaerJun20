package de.gothaer;

public class Angestellter extends Thread{
	
	private final Bank bank;
	private final int von;
	private final int nach;
	private final int betrag;
	
	public Angestellter(Bank bank, int von, int nach, int betrag) {
		this.bank = bank;
		this.von = von;
		this.nach = nach;
		this.betrag = betrag;
	}

	@Override
	public void run() {
		try {
			bank.ueberweisen(von, nach, betrag);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
