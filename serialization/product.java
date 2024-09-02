package com.evergent.corejava.serialization;

import java.io.Serializable;

public class product implements Serializable {
	   private int id;
	   private String name;
	public product(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	

}
