package com.java.Polymorphism;

//Compile time /Early/static Polymorphism.

public class MetodOverloading extends OverloadingParent
{
	public void addition(int a)
	{
	System.out.println(a);
	}
	public void additoin(int b,String c)  // we don't use same parameter (or data type) in method Overloading
	{
		System.out.println(b+c);
	} 
	public void additoin(int a,int b)
	{
		System.out.println(a+b);
	}
	public void additoin(float d)
	{
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		MetodOverloading object=new MetodOverloading();
		object.addition(12);
		object.additoin(10,"irfan Ahmad");
		object.additoin(20,20);
		object.additoin(40);
		object.addition(14);  // its from Parent class we can use same data type or parameter in other class but not in same class
		
	}

}
