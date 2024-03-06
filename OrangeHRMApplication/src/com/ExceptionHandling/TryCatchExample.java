package com.ExceptionHandling;

public class TryCatchExample 
{
	
	protected void division3()
	{
		try 
		{
			int var1=20;
			int var2=0;
			int var3;
			
			var3=var1/var2;
			
			System.out.println("The value of the variable after division is:-"+var3);
			
		}
		catch(Exception srini)
		{
			System.out.println("The Exception is :-"+ srini);
		}
		
		
	}
	
	public static void main(String[] args) {

		TryCatchExample tryCatch = new TryCatchExample();
		tryCatch.division3();

		tryCatch.division1();
		tryCatch.division2();

		}

	private void division2() {
		// TODO Auto-generated method stub
		
	}

	private void division1() {
		// TODO Auto-generated method stub
		
	}

}
