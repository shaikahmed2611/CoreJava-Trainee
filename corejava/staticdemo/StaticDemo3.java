package com.evergent.corejava.staticdemo;

public class StaticDemo3 {
	static String cname="India";
	       String name="Ramesh";
	 static public void myData()
	 {
		 System.out.println("Mydata");
	 }
	 public void show()
	 {
		 System.out.println("show is non static method");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation is required for non static method to access in static method
		System.out.println(StaticDemo3.cname);
		StaticDemo3.myData();

	}

}
