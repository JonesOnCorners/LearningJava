package com.durgasoft.multithreading;

class MyThread implements Runnable
{
    int count=0;
	public void run()
	{
		
		Thread.currentThread().setPriority(7);
		for(int i=0;i<10;i++)
		{			
			System.out.println("child");
			count++;
			if(count==3)
			{
				Thread.yield();
			}
		}
		count=0;
		
	}
}

public class ThreadingBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setPriority(9);
		MyThread r = new MyThread();
		
		
		Thread t = new Thread(r);
		
		t.start();
		for (int j=0;j<10;j++)
		{
			System.out.println("main thread");
		}
		/*System.out.println("Thread name=" +t.getName());
		System.out.println("Thread name=" +t1.getName());
		System.out.println("Thread priority=" +t.getPriority());
		System.out.println("Thread priority=" +t1.getPriority());
		System.out.println("Thread priority=" +t.getPriority());*/
		
	}

}
