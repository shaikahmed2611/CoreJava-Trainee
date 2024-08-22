package com.evergent.corejava.basicprogram;
import java.util.*;
public class BigOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number1");
		int n1=scr.nextInt();
		System.out.println("enter the number2");
		int n2=scr.nextInt();
		if(n1>=n2)
		{
			System.out.println(n1+" is the biggest number");
		}
		else
		{
			System.out.println(n2+" is the biggest number");
		}


	}

}
