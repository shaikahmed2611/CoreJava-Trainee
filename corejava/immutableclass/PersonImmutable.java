package com.evergent.corejava.immutableclass;

public  final class PersonImmutable { // creating the immutable class
	private final String name;   // final variable
	
	private final int age;
	PersonImmutable(String name,int age)   // constructor for immutable class
	{
		this.name=name;
		this.age=age;
	}
	public String myName()  // myname method for immutable class
	{
		return name;
	}
	public int myAge()   //Age method for immutable class
	{
		return age;
	}

}
