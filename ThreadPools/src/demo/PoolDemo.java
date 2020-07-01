package demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PoolDemo {
	
	public static void main(String[] args) throws Exception{
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		service.execute(new Runnable() {
			
			@Override
			public void run() {
				// Tu was langläufiges
				
			}
		});
		service.execute(new Runnable() {
			
			@Override
			public void run() {
				// Tu was langläufiges
				
			}
		});
		
		service.execute(new Runnable() {
			
			@Override
			public void run() {
				// Tu was langläufiges
				
			}
		});
		service.shutdown();
		service.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
		System.out.println("Fertig");
	}

}
