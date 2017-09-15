
public class InnerClass {
	
	private int a;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public class InsideClass{
		
		//new InnerClass().setA(10);
		public void display(){
			System.out.println(a);
		}
	}

}
