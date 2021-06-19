package Exceptions;

public class MultiException {

	public static void main(String[] args) {

		try{
			int a=10;
			int b=0;
			int c =a/b;
			System.exit(0);
		}
		catch (Exception e) {
	         System.out.println("Exception thrown :" + e);
	         //System.exit(0);
	      } 
		finally {
			//System.exit(-1);
			System.out.println("inside finally");
		}
	}	

}
