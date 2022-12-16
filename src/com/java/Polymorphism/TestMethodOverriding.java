package com.java.Polymorphism;

public class TestMethodOverriding 
{
	public static void main(String[] args) {
		ChildMethodOverriding c=new ChildMethodOverriding();
		c.bunglow();
		c.car();
		c.farm();
		c.addition(10,20);
		
		System.out.println("-------------------------------------------------------------------------------");
		ParentOverriding p=new ParentOverriding();
		p.bunglow();
		p.car();
		p.farm();
		p.addition(10, 20);
		
	}

}
