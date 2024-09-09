package com.evergent.corejava.java8Lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaProg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>mygames=new ArrayList<String>();
		
		
		mygames.add("Chees");
		mygames.add("Hocky");
		mygames.add("Kabbadi");
		mygames.add("Cricket");
		// USING FOR LOOP 
		for(String str:mygames)
		{
			System.out.println("games "+str);
		}
		//USING FOREACH ADVANCE LOOP
		mygames.forEach(t->System.out.println(t));
		// USING FOREACH USING REFERNCE METHOD
		mygames.forEach(System.out::println);
	
		

	}

}
