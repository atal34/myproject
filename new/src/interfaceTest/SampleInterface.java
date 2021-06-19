package interfaceTest;

public interface SampleInterface {
	
	public String s = "abc";
	
	public void getName();
	
	public  default void display(){
		System.out.println("inside display  of interface ");
		
	}
	public static void display1(){
		System.out.println("inside display 1 of interface ");
	}
	
	 static void display2(){
		System.out.println("inside display 2 of interface ");
	}
	

}
