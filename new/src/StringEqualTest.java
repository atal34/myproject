import java.util.Scanner;


public class StringEqualTest{

	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abc";
		String s2="abc";
	
		
		String s3=new String("abc");
		String s4=new String("abc");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		if(s1==s2){
			System.out.println("s1 equal to s2" + s1);
		}
		if(s1==s3){
			System.out.println("s1 equal to s3");
		}
		if(s3==s4){
			System.out.println("s3 equal to s4");}
							System.out.println(s3==s4);
			
		
		System.out.println(s1.getClass());
		System.out.println("enter name");
		Scanner sc=new Scanner(System.in);
		String news= sc.nextLine();
		System.out.println(news);
		
	
	}
}
