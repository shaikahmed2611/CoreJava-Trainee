package com.evergent.corejava.constructor;

public class Employee2 {
	int eno;
	String ename;
	double sal;
	Employee2()
	{
		System.out.println("Default Constructor");
	}
	Employee2(int eno1,String ename1,double sal1)
	{
		eno=eno1;
		ename=ename1;
		sal=sal1;
	}
	public void display()
	{
		System.out.println("employee number "+eno+"employee name "+ename+"employee salary "+sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new Employee2();
         Employee2 emp2=new Employee2(123,"ahmedshaik",2345.6);
         emp2.display();
		

	}

}
