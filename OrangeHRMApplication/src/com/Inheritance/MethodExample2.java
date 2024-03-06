package com.Inheritance;

public class MethodExample2 {
	
	
	protected void multiplication()
	{
	int var1=20;
	int var2=30;
	int var3;

	var3=var1*var2;

	System.out.println(" The value of the varibale var3 after Multiplication is :-"+var3);
	}


	public static void main(String[] args) {

	MethodExample2 m2 = new MethodExample2();
	System.out.println(" Multiplication Method of MethodExample2 Java Class");
	m2.multiplication();

	System.out.println();

	/*
	MethodExample1 m1 = new MethodExample1();
	System.out.println(" Addition Method of MethodExample1 Java Class");
	m1.addition();
	*/

	System.out.println(" Addition Method of MethodExample1 Java Class");
	m2.addition();


	}


	private void addition() {
		// TODO Auto-generated method stub
		
	}

}
