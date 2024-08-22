package com.evergent.corejava.basicprogram;

import java.util.Scanner;

public class BigOfThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number1");
		int n1=scr.nextInt();
		System.out.println("enter the number2");
		int n2=scr.nextInt();
		System.out.println("enter the number3");
		int n3=scr.nextInt();
		if(n1>=n2 && n1>=n3)
		{
			System.out.println(n1+"is big of three number");
		}
		else if(n2>=n1 && n2>=n3)
		{
			System.out.println(n2+"is big of three number");
		}
		else
		{
			System.out.println(n3+" is big of three number");
		}

	}

}
