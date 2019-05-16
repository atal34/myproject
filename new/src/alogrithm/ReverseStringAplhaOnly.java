package alogrithm;

public class ReverseStringAplhaOnly {

	public static void main(String[] args) {

		String input = "abc;hgd$(;";
		String specialChars = "!@#$%^&*()";
		
		int a = 0;
		int len = input.length();

		System.out.println(len);
		
		for(int i=0;i<len/2;i++){
			if(specialChars.contains(input.substring(i, i+1)) || specialChars.contains(input.substring(i, i+1))){
				
			}
		}
		
		
		
		
	}

}
