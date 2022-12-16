package com.java.LogicalPrograms;
import java.util.Scanner;
public class Calculator_program 
{
	public static void main(String[] args) 
	{
		Scanner object=new Scanner(System.in);
		System.out.println("enter the first numbers");
		int a=object.nextInt();
		String operator;
		System.out.println("enter the operator");
		operator =object.next();
		System.out.println("enter the second number");
		int b=object.nextInt();	
		switch(operator)
		{
		case "+":
			System.out.println("="+(a+b));
			break;
		
		case "-":
		
			System.out.println(a-b);
			break;
			
		case"*":
			System.out.println(a*b);
			break;
			
		case "/":
			System.out.println(a/b);
			break;
		}
	}
}
