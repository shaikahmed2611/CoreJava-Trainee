package com.evergent.corejava.multithreading;
class MyThread extends Thread
{
	public void run() {
		for(int i=1;i<=100;i++)
		{
			System.out.println(i+"Thread "+Thread.currentThread().getName());
			
			
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread th=new MyThread();
		th.setPriority(9);
		th.setName("Ahmed");
		th.start();
	
		MyThread th2=new MyThread();
		th.setPriority(10);
		th2.setName("shaik");
		th2.start();
		
		
		

	}

}
