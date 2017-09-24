package comparatorDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmpComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> empList = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1,"Atal",10000f);
		Employee e2 = new Employee(4,"Aabha",20000f);
		Employee e3 = new Employee(2,"Manish",30000f);
		Employee e4 = new Employee(3,"Neha",150000f);
		
		empList.add(e1);empList.add(e2);empList.add(e3);empList.add(e4);
		
		Collections.sort(empList);
		
		for (Employee e : empList){
			System.out.println(e.getEmpID()+" "+e.getName()+" "+e.getSalary());
			System.out.println("\n");
		}
		
		Collections.sort(empList, new EmpComparator());
		
		for (Employee e : empList){
			System.out.println(e.getEmpID()+" "+e.getName()+" "+e.getSalary());
			System.out.println("\n");
		}
		
	}

}
