package com.evergent.corejava.constructor;

public class Employee3 {

	int eno;
	String ename;
	double sal;
	Employee3()
	{
		System.out.println("Default Constructor");
	}
	Employee3(int eno,String ename,double sal)
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
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
