package cloneTest;

import java.io.Serializable;

public class Cource implements Cloneable,Serializable{

	String sub1;
	String sub2;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public Cource(String sub1, String sub2) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
	
	
}
