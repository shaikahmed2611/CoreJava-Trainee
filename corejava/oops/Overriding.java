package com.evergent.corejava.oops;
class MyBigData
{
	public void myData()
	{
		System.out.println("My data in class");
	}
}

public class Overriding extends MyBigData {
	/*public void myData()
	{
		System.out.println("My data");
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding over=new Overriding();
		over.myData();

	}

}
