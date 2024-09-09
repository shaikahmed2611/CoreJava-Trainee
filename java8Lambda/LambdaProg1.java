package com.evergent.corejava.java8Lambda;
interface Prog1
{
	public void food();
}


public class LambdaProg1 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prog1 p1=new Prog1() {
			public void food()
			{
				System.out.println("Fast Food");
			}
		};
		p1.food();
		

	}

}
