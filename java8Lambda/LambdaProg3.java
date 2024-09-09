package com.evergent.corejava.java8Lambda;

interface Prog3
{
	public void food(String name);
}
public class LambdaProg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prog3 p3=(name)->{
			{
				System.out.println("MY NAME IS : "+name);
			}
			
		};
		p3.food("Ahmed");
		

	}

}
