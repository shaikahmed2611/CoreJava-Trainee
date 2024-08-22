package com.evergent.corejava.ahmed.application4;
import java.util.*;
public class Login {
	
	public boolean LoginDetail(String email1,String password1,String email2,String password2)
	{
	     if(email1.equals(email2)&& password1.equals(password2))
	     {
	    	 return true;
	     }
	     return false;
	        
	}
	
	

}
