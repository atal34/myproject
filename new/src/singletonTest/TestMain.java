package singletonTest;

public class TestMain {

	public static void main(String[] args) throws CloneNotSupportedException{

		System.out.println("Hello!");
		
		SingletonDemo s1 = SingletonDemo.getInstance();
		SingletonDemo s2 = (SingletonDemo) s1.clone();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
