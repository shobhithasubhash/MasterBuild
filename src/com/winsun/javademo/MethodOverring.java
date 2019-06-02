package com.winsun.javademo;


class SuperClassDemo {
	//inheritance happens only for non-static member
	public void show() {
		System.out.println("super class");
	}
	
	public static void showstatic() {
		System.out.println("static super class");
	}
}


public class MethodOverring extends SuperClassDemo {
	//method overriding happens with in the between classes
	//to do method method overriding we need there is relation between the classes i.e inheritance
	public static void main(String[] args) {
		SuperClassDemo superObj = new SuperClassDemo();
		superObj.show();
		
		MethodOverring methodObj = new MethodOverring();
		methodObj.show();
		// TODO Auto-generated method stub
		showstatic();
	}
	
	public void show() {
		System.out.println("sub class");
	}

}
