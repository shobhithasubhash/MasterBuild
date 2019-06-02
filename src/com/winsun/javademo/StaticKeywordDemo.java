package com.winsun.javademo;

public class StaticKeywordDemo {
	//object creation: create the object using className
	//with non static class member, all global variables are class member
	static String strMsgHI = "Global variable";
	public static void main(String[] args) {
		//non-static: to Access non static class member we have tp create the object with corresponding class
		ConstructorOverloading contObj = new ConstructorOverloading("Welcome");
		System.out.println(contObj.strwelMsg);
		ConstructorOverloading contObj1 = new ConstructorOverloading("Hello");
		System.out.println(contObj1.strwelMsg);
		//static: we can able to using class member if the static variable present outisde class
		//if it is present inside the same class then we can call directly without using classname
		System.out.println("before changing float value: "+ConstructorOverloading.floatVal);
		ConstructorOverloading.floatVal = 20.0;
		System.out.println("after changing float value: "+ConstructorOverloading.floatVal);
		
		//local variable can able to access with in method/ with in the context
		String strMsgHI = "local variable";
		System.out.println("HI Message: "+strMsgHI);
		System.out.println(StaticKeywordDemo.strMsgHI);
		
		
	}

}
