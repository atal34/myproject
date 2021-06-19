package streamLambda;

public class Employee implements Comparable<Employee> {
	 
    // employee members
    String empName;
    int empId;
    int empAge;
    String empDesignation;
 
    // 4-arg parameterized constructor
    public Employee(String empName, int empId, 
            int empAge, String empDesignation) {
        super();
        this.empName = empName;
        this.empId = empId;
        this.empAge = empAge;
        this.empDesignation = empDesignation;
    }
 
    // getter & setter
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public int getEmpAge() {
        return empAge;
    }
    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
    public String getEmpDesignation() {
        return empDesignation;
    }
    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }
 
    // override toString() method
    @Override
    public String toString() {
        return "Employee ["
                + "empName=" + empName
                + "\tempId=" + empId
                + "\tempAge=" + empAge 
                + "\tempDesignation=" + empDesignation
                + "]";
    }
 
    // override compareTo() method
    @Override
    public int compareTo(Employee emp) {
        return this.empName.compareTo(emp.getEmpName());
    }
}
