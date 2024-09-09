package com.evergent.corejava.java8Lambda;
interface Prog2
{
	public void food1();
	
}

public class LambdaProg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prog2 p2=()->{
			{
				System.out.println("This is Fast Food");
			}
		};
		p2.food1();

	}

}
