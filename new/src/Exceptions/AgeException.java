package Exceptions;

public class AgeException extends Exception{

	public AgeException(String string) {
		// TODO Auto-generated constructor stub
		setS(string);
		
	}
	private String s;
	
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	
	

}
