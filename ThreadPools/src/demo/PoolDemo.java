package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class PoolDemo {
	
	public static void main(String[] args) throws Exception{
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
//		service.execute(new Runnable() {
//			
//			@Override
//			public void run() {
//				// Tu was langläufiges
//				
//			}
//		});
//		service.execute(new Runnable() {
//			
//			@Override
//			public void run() {
//				// Tu was langläufiges
//				
//			}
//		});
//		
//		service.execute(new Runnable() {
//			
//			@Override
//			public void run() {
//				// Tu was langläufiges
//				
//			}
//		});
//		service.shutdown();
//		service.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
		List<Future<Integer>> values = new ArrayList<>();
		values.add((service.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				// Warte 10 Millionen Jahre
				return 42;
			}
		})));
		
		Future<Integer> value2 = service.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				// Anderer langlaufender Process
				return 28;
			}
		});
		
		service.shutdown();
		
		int ergebnis1 = value1.get();
		int ergebnis2 = value2.get();
		
		
		System.out.println("Fertig");
	}

}
