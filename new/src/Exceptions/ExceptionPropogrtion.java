package Exceptions;

public class ExceptionPropogrtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try 
		{
			System.out.println("trying to call another method");
			
			ExceptionInClass ec = new ExceptionInClass();
			ec.testMethod();
		} 
		catch (Exception e) {
			System.out.println("Inside catch of calling class");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
