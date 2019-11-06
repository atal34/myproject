package cloneTest;

import java.io.Serializable;

public class Student1 implements Cloneable,Serializable{
	
	private String name;
	private int rollNo;
	private String address;
	Cource c1;
	
	public Student1(String name, int rollNo, String address, Cource c1) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
		this.c1 = c1;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		 Student1 student = (Student1) super.clone();
		 
	        student.c1 = (Cource) c1.clone();
	 
	        return student;
	}
	
	public Student1(String name, int rollNo, String address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
