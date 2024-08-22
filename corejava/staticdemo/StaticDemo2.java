package com.evergent.corejava.staticdemo;

// static method can access static variable and static method
public class StaticDemo2 {
	static String cname="ahmed";// static keyword
	String location="hyderabad";
	
  static public void myData()
    {
    	System.out.println("Hello");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cname);
		myData();

	}

}
