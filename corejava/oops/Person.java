package com.evergent.corejava.oops;

public class Person {
     String name="ahmed";
     int age=20;
     String address="hyderabad";
     public void display()
     {
    	 System.out.println(name+" "+age+" "+address);
     }
     public void display_name()
     {
    	 System.out.println(name);
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.display();
		p1.display_name();
		

	}

}
