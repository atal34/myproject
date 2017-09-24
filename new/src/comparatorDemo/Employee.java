package comparatorDemo;

public class Employee implements Comparable{
	
	private int empID;
	private String name;
	private float salary;
	
	public Employee() {
		
	}
	
	Employee(int a,String b,float c){
		this.empID = a;
		this.name = b;
		this.salary = c;
	}
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		int compareId = ((Employee)obj).getEmpID();
		return this.empID - compareId;
	}
	

}
