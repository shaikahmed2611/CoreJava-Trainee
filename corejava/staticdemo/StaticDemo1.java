
package com.evergent.corejava.staticdemo;

public class StaticDemo1 {
	static String name="India";
	static public void myData()
	{
		System.out.println("MyData");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo1.name);
		StaticDemo1.myData();
         
	}

}
