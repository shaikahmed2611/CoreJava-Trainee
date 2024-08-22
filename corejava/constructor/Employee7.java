package com.evergent.corejava.constructor;
class Car
{
	String color;
	int maxspeed;
	Car()
	{
		color="white";
		maxspeed=120;
	}
	Car(String color,int maxspeed)
	{
		this.color=color;
		this.maxspeed=maxspeed;
	}
	void display()
	{
		System.out.println("Color : "+color);
		System.out.println("MaxSpeed : "+maxspeed);
	}
}

public class Employee7 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		Car c2=new Car("Red",50);
		c1.display();
		c2.display();

	}

}
