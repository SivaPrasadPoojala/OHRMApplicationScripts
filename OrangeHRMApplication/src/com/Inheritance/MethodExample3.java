package com.Inheritance;

public class MethodExample3 {
	
	
	
	public void subtraction()
	{
	int var1=20;
	int var2=30;
	int var3;

	var3=var1-var2;

	System.out.println(" The value of the varibale var3 after Subtraction is :-"+var3);
	}

	public static void main(String[] args) {

	MethodExample3 m3 = new MethodExample3();
	System.out.println(" Subtraction Method of MethodExample3 Java Class");
	m3.subtraction();

	System.out.println();

	System.out.println(" Multiplication Method of MethodExample2 Java Class");
	m3.multiplication();

	System.out.println();

	/*
	MethodExample1 m1 = new MethodExample1();
	System.out.println(" Addition Method of MethodExample1 Java Class");
	m1.addition();
	*/

	System.out.println(" Addition Method of MethodExample1 Java Class");
	m3.addition();

	}

	private void addition() {
		// TODO Auto-generated method stub
		
	}

	private void multiplication() {
		// TODO Auto-generated method stub
		
	}


}
