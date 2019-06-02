package com.winsun.javademo;

public class ConstructorOverloading {

	String strwelMsg;
	String name;
	int valueage;
	static double floatVal = 10.0;

	public ConstructorOverloading() {
		// TODO Auto-generated constructor stub
	}
	//constructor overloading with  no argument, one argument, two argument 
	//constructor overloading with  with different argument type and different argument position
	public ConstructorOverloading(String strMessage, String name) {
		this.strwelMsg = strMessage;
		this.name = name;
	}

	public ConstructorOverloading(String strMessage) {
		this.strwelMsg = strMessage;

	}

	public ConstructorOverloading(String name, int valueage) {
		this.name = name;
		this.valueage = valueage;

	}
	
	
	
}
