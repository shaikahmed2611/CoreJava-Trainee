package com.evergent.corejava.multithreading;
class Mythread2 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread2 m1=new Mythread2();
		Thread t1=new Thread(m1);
		t1.start();
		Thread t2=new Thread(m1);
		t2.start();
		
		

	}

}
