package Exceptions;

public class CustomExceptionTest {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub

		int age = 15;
		try{
		if(age<18){
			throw new AgeException("Age should be greater than 18");
		}
		}
		
		catch(AgeException a){
			System.out.println("Exception caught"+a.getS());
		}
	}

}
