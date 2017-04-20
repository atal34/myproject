
public class MethodA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b=new C();
		C c=new C();
		b.method2();
		c.method2();
	}

}

 class B{
	
	public void method2(){
		System.out.println("Inside menthod 2 of class B");
	}
}

 class C extends B{
		
		public void method2(){
			System.out.println("Inside menthod 2 of class C");
		}
		public void method1(){
			System.out.println("Inside menthod 1 of class C");
		}
	}