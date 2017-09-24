package comparatorDemo;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		String name1 = e1.getName().toUpperCase();
		String name2 = e2.getName().toUpperCase();
		return name1.compareTo(name2);
	}

}
