package com.UserDefinedMethods;

public class MethodExample_1 {
	

	// User defined methods should never be written within the main method
	// User defined methods can be either written above the Main method of below the main Method
	
	// User defined methods will never be executed by themselves
	// To Run the User defined Method - we should create an object for the Current Class
	// Using the Objected create - user defined method should be called
	
	// User defined method names should be Unique
	
	// * User defined methods are created for ReUsability purpose
	
	
	public void test3()
	{
		System.out.println(" Test3 Method Executed Successfully ");
	}
	
	public static void main(String[] args)
	{
		System.out.println(" Testing ");
				
		// creating an object for the Current class
		MethodExample_1 m1 = new MethodExample_1(); 
		
		// using the object of the current class - calling the user defined method
		m1.test1();
		m1.test3();
		
System.out.println(" Print statement is executing after performing operation of User Defined Method");

	// MethodExample1 m2 = new MethodExample1();
	m1.test2();
	
	
	m1.test1();

	} 
	
	public void test1() // User defined Method
	{
		System.out.println(" Test1 Method Executed Succesfully ");
	}
	
	public void test2()
	{
		System.out.println(" Test2 Method Executed Successfully ");
	}

}
