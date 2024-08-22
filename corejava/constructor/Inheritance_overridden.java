package com.evergent.corejava.constructor;
class Animal
{
	private String name;
	private int age;
	public Animal(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("name"+name);
		System.out.println("Age "+age);
	}
}
class Dog extends Animal{
	private String breed;
	public Dog(String name,int age,String breed)
	{
		super(name,age);
		this.breed=breed;
	}
	public void displayInfo()
	{
		super.display();
		System.out.println(breed);
	}
}

public class Inheritance_overridden {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog("Buddy",5,"Golden Retriver");
		d.displayInfo();

	}

}
