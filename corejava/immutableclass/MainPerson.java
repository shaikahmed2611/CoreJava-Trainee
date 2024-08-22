package com.evergent.corejava.immutableclass;

public class MainPerson {

	public static void main(String[] args) {
		
		PersonImmutable p1=new PersonImmutable("ahmed",22); // creating object of PersonImmutable class
		System.out.println("name :"+p1.myName());// access the final class method
		System.out.println("Age :"+p1.myAge());

	}

}
