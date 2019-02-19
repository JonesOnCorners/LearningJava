package com.multithreading.basics;


class BasicMultiThreadingRun implements Runnable{
	public void run() {
		System.out.println("Displaying Thread with ID = "+ Thread.currentThread().getId());
	}
}

public class BasicMultiThreadingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for (int i=0;i>10;i++) {
			Thread object = new Thread(new BasicMultiThreadingRun());
			object.start();
		}

	}

}
