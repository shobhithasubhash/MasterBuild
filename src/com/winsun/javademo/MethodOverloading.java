package com.winsun.javademo;

public class MethodOverloading {
//method overloading happens with in the class 
	public static void main(String[] args) {
		//static method
		show();
		show("with one");
		show("with ", 2);
		show(2,"with ");
		
		//non static method
		MethodOverloading methodOverObj = new MethodOverloading();
		methodOverObj.add();
		methodOverObj.add(10);
		methodOverObj.add(10,20);
	}
	
	public static void show() {
		System.out.println("Method overloadin no arguments");
	}
	
	public static void show(String strMsg) {
		System.out.println("Method overloadin "+strMsg+" arguments");
	}
	
	public static void show(String strMsg, int value) {
		System.out.println("Method overloading "+strMsg+"------"+value+" arguments");
	}
	
	public static void show(int value, String strMsg) {
		System.out.println("Method overloading "+value+"------"+strMsg+" arguments");
	}
	
	public void add() {
		System.out.println("Method overloadin no arguments"+(20+40));
	}
	
	public void add(int valueA) {
		System.out.println("Method overloadin one arguments"+(20+valueA));
	}
	
	public void add(int valueA, int valueB) {
		System.out.println("Method overloading two arguments: "+(valueA+valueB));
	}

}
