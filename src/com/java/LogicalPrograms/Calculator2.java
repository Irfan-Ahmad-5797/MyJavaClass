package com.java.LogicalPrograms;
import java.util.Scanner;
public class Calculator2 {
  public static void main(String[] args) {
	Scanner cal=new Scanner(System.in);
	System.out.println("enter 1st num");
	int a=cal.nextInt();
	System.out.println("enter operator");
	String operator;
	operator =cal.next();
	System.out.println("enter 2nd num");
	int b=cal.nextInt();
	switch(operator)
	{
	case "+":
		System.out.println("="+(a+b));
		break;
	case "-":
		System.out.println("="+(a-b));
		break;
	case "*":
		System.out.println("="+(a*b));
		break;
	case "/":
		System.out.println("="+(a/b));
		
	}
	
	
}
}
