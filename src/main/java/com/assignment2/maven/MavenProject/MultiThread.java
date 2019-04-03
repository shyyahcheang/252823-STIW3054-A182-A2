package com.assignment2.maven.MavenProject;

public class MultiThread {

	public static void main( String[] args ) {
		
		try {
			Thread_1 r1 = new Thread_1();
			Thread t1 = new Thread(r1);
			t1.start();
			Thread.sleep(2000);
			t1.join();
		
	        Thread_2 r2 = new Thread_2();
	        Thread t2 = new Thread(r2);
	        t2.start();
	        Thread.sleep(2000);
	        t2.join();
			
	        Thread_4 r4 = new Thread_4();
	        Thread t4 = new Thread(r4);
	        t4.start();
	        Thread.sleep(2000);
	        t4.join();
	        
	        Thread_3 r3 = new Thread_3();
	        Thread t3 = new Thread(r3);
	        t3.start();
	        Thread.sleep(2000);
	        t3.join();
			
	        Thread_5 r5 = new Thread_5();
	        Thread t5 = new Thread(r5);
	        t5.start();
	        Thread.sleep(2000);
	        t5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}
