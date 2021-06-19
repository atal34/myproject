package interfaceTest;

public class ExtClass extends AbstractClass implements SampleInterface{

	@Override
	public void getName() {
		System.out.println(" name = extclass");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
	public static void display2(){
		System.out.println("inside display 2 of class ");
	}

}
