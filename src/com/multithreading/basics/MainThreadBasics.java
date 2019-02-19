package com.multithreading.basics;

class ChildThread extends Thread{
	public void run(){
		
		for (int i=0;i<10;i++) {
			System.out.println("Running child thread "+i);	
		}
		
	}
}

public class MainThreadBasics extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = Thread.currentThread();
		t.setPriority(MIN_PRIORITY);
		
		System.out.println("Name of current thread is-->"+t.getName());
		
		t.setName("Chaitu");
		
		System.out.println("Name of current thread is changed-->"+t.getName());
		
		ChildThread ct = new ChildThread();
		   
        for (int i = 0; i < 5; i++) 
        { 
            System.out.println("Main thread"); 
        } 
          
		System.out.println("Now starting child thread-->");
		ct.setPriority(MAX_PRIORITY);
		ct.start();
		
		System.out.println("Now starting main thread-->");
		
		

	}

}
