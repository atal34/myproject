class SuperDemo {
	
	public SuperDemo(){
		System.out.println("in super class constructor");
	}
	public void print(){
		System.out.println("in super class");
	}
	
}
public class SubTestDemo extends SuperDemo{

	public void print(){
		System.out.println("in sub class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperDemo s=new SubTestDemo();
		SuperDemo s1=new SuperDemo();
		//SubTestDemo s3=new SuperDemo(); //compile time error
		System.out.println(s.getClass());
		System.out.println(s1.getClass());
		s.print();
		s1.print();
	}

}
