package com.evergent.corejava.java8Lambda;
interface prog5
{
	public void food(String name1,String name2);
}

public class LambdaProg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prog5 p5=(name1,name2)->{
			{
				System.out.println("MY First name is "+name1+" My Last Name is "+name2);
			}
		};
		p5.food("shaik", "ahmed");
		

	}

}
