package dataTypes;

import PDF.AddingContent;

public class FloatTest {

	public static void add(float f, int i){
		System.out.println(f+i);
	}
	
	public void add(int i, float f){
		System.out.println(f+i);
	}
	
	public static void main(String[] args) {

		float f = 123;
		
		Double d = (double) 1234f;
		
		System.out.println(f);
		add(10.0f,10);
		
	}

}
