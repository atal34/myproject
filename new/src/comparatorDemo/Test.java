package comparatorDemo;


//dead code
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e = null;
		int a = 0;
		
		if (a==0 && null!=e){
			System.out.println("Condition success");
		}
		
		if (null!=e && a==0){
			System.out.println("Condition success again ");
		}
		

	}

}
