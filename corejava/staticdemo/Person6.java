package com.evergent.corejava.staticdemo;

public class Person6 {
	 String name="Raju";
	int age=28;
	public void display()
	{
		name="welcome";
		System.out.println("name "+name);
		System.out.println("Age"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person6 p6=new Person6();
        p6.display();
        Person6 p2=new Person6();
        System.out.println(p2.name);
   
	}

}
