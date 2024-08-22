package com.evergent.corejava.oops;
//method overloading example
public class UserLogin {
	public void LoginDetail()   // same method with no parameter
	{
		System.out.println("Login Details");
	}
	public void loginDetail(String username,String pass) // same method with 2 parameter
	{
		System.out.println("user name "+username);
		System.out.println("user password "+pass);
	}
	public void loginDetail(String uname,String pass,String capgcha) // same method with 3 parameter
	{
		System.out.println("user name "+uname);
		System.out.println("user password "+pass);
		System.out.println("capgcha "+capgcha);
	}
	public int loginDetail(int mobile,String pass)   // same method with 2paramter with return type
	{
		System.out.println("Mobile "+mobile);
		System.out.println("pass "+pass);
		return 0;
	}
	public static void main(String[] args)
	{
		UserLogin ul=new UserLogin();
		ul.LoginDetail();
		ul.loginDetail(80745485,"123"); //accesing line number 8  same method with 2 parameter
		ul.loginDetail("ahmed","123","567"); //accesing line number 13 
		ul.loginDetail("shaik", "809");
		
	}
}
