package com.evergent.corejava.oops;

public class Has_A_Demo {
	public void m1()
	{
		System.out.println("Has-A-Demo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Has_A_Demo hs=new Has_A_Demo();
		hs.m1();
		Person p1=new Person();
		p1.display_name();

	}

}
