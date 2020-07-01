package de.gothaer;

public class Bank {
	
	private int [] konten = { 30, 50, 100 };
	
	public void kontostand() {
		for (int i = 0; i < konten.length; i++) {
			System.out.println("Konto Nr. " + i +  " hat den Saldo: " + konten[i]);
		}
		System.out.println("---------------");
	}
	
	public synchronized void ueberweisen(int von , int nach, int betrag) throws Exception{
		
			int zettel = konten[von];
			zettel -= betrag;
			Thread.sleep((long) (Math.random() * 1000));
			konten[von] = zettel;
			konten[nach] += betrag;
			kontostand();
		
	}

}
