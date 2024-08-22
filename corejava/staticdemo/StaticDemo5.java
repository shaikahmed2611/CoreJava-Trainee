package com.evergent.corejava.staticdemo;

public class StaticDemo5 {
	static String cname="India";
	String name="Ramesh";
	
	static public void myData()
	{
		System.out.println("Mydata");
	}
	static
	{
		System.out.println("Welcome to evergent");
	}
	{
		System.out.println("welcome to our team");
	}
	public void show()
	{
		myData();
		System.out.println(cname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StaticDemo5 st=new StaticDemo5();
	st.show();
		

	}

}
