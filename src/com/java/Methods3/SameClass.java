package com.java.Methods3;

import com.java.Methods4.DiffPackDiffClass;

public class SameClass

{
	public static void SameClassStaticMethod()	
	{
		System.out.println("Static method from same class");
	}
	public void SameClassNonStaticMethod()
	{
		System.out.println("non static method from same class");
	}

	public static void main(String[] args) 
	{
		System.out.println("start program");
		SameClassStaticMethod();
		DiffClass.DiffClassMethod();
		
		DiffPackDiffClass a = new DiffPackDiffClass();
		a.diffpackstaticMethod();
		
		SameClass b= new SameClass();
		b.SameClassNonStaticMethod();
		
		DiffClass c= new DiffClass();
		 c.DiffClassNonStaticMethod();
		 
		DiffPackDiffClass d = new DiffPackDiffClass();
		 d.diffpackNonstaticMethod();
		
		System.out.println("end program");
	}
}
