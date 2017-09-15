
public class ChainingConstructor {
	
	public String name;
	
	ChainingConstructor(){
		System.out.println("Inside super class constructor");
	}
	ChainingConstructor(String name){
		 this.name = name;
	}
	public static void main(String[] args){
		ChainingConstructor c = new ChainingConstructor();
		Subclass s = new Subclass();
	}
}

public class Subclass extends ChainingConstructor{
	
	public int val;
	
	Subclass(){
		System.out.println("Inside subclass constructor");
	}
	
	Subclass(int v){
		super();
		this.val = v;
	}
}
