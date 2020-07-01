package demo;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Demo {
	
	private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE/2;
	private final int [] feld = new int[MAX_ARRAY_SIZE];

	public static void main(String[] args) {
		new Demo().run();

	}

	private void run() {
		Random random = new Random();
		
		Instant start = Instant.now();
		for (int i = 0; i < feld.length; i++) {
			feld[i] = random.nextInt();
		}
		Instant ende = Instant.now();
		Duration duration = Duration.between(start,ende);
		
		System.out.println("Duration = " + duration.toMillis());
		
	}

}
