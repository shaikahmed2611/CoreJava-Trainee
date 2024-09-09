package com.evergent.corejava.java8Lambda;
interface Prog6
{
	public int food(int a,int b);
}
public class LambdaProg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prog6 p5=(a,b)->{
			int sum=a+b;
			return sum;
		};
	int res=p5.food(10,20);
	System.out.println("Sum of two Number : "+res);

	}

}
