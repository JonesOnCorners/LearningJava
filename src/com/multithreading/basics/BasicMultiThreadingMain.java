package com.multithreading.basics;


class BasicMultiThreading  extends Thread {
	
	public void run() {
		try {
			System.out.println("Running Thread " +Thread.currentThread().getName() + " " +Thread.currentThread().getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


public class BasicMultiThreadingMain {
	public static void main(String[] args) {
		
		
		for (int i=0;i<10;i++) {
			BasicMultiThreading bmt = new BasicMultiThreading();
			bmt.start();
			
		}
		
	}
}
