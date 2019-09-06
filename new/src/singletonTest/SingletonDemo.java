package singletonTest;

public class SingletonDemo extends MyClone{
	
	private SingletonDemo(){
		
	}

	private static SingletonDemo instance;
	
	public static SingletonDemo getInstance(){
		
		if(instance == null){
			instance = new SingletonDemo();
			return instance;
		}
		
		return instance;
		
	}
}
