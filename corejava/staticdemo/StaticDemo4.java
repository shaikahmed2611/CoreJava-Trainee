package com.evergent.corejava.staticdemo;

public class StaticDemo4 {
	static String cname="India";
	String name="Ramesh";
	
	static public void myData()
	{
		System.out.println("Mydata");
	}
	public void show()
	{
		myData();
		System.out.println(cname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StaticDemo4 st=new StaticDemo4();
	st.show();
		

	}

}
