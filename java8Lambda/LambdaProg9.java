package com.evergent.corejava.java8Lambda;
interface Names
{
	public String myName(String names);
}

public class LambdaProg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Names n1 =(names)->{
			 String str1="CoreJava :";
			 String str2= str1 +names;
			 return str2;
		 };
     System.out.println(n1.myName("JAVA8"));

	}


}
