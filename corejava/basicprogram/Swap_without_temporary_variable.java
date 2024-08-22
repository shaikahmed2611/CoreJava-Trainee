package com.evergent.corejava.basicprogram;

public class Swap_without_temporary_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);

	}

}
