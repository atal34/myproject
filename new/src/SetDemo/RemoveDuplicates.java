package SetDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		
		List<String> list = new ArrayList<String>();
		
		list.add("Atal");
		list.add("Anika");
		list.add("Atal");
		list.add("juhi");
		list.add("pawan");
		
		Set<String> set = new HashSet<String>();
		set.addAll(list);
		
		System.out.println(set);
		
		
		
	}

}
