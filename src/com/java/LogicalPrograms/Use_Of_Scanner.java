package com.java.LogicalPrograms;
import java.util.Scanner;
public class Use_Of_Scanner {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter your name");
		String name=s.next();
		
		System.out.println("enter your mobile number");
		long mobno=s.nextLong();
		
		System.out.println("gender");
		char gender=s.next().charAt(0);
		
		System.out.println("enter your age");
		int age=s.nextInt();
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("name:"+name);
		System.out.println("mobile no;:"+mobno);
		System.out.println("gender:"+gender);
		System.out.println("age:"+age);
	}
}
