package com.java.Polymorphism;

public class ChildMethodOverriding extends ParentOverriding
{
   public void bunglow()
   {
	   System.out.println("child bunglow = 01");
   }
   public void addition(int x,int y)
   {
	   int z=20;
	   int sum=x+y+z;
	   System.out.println("child sum="+sum);
   }
}
