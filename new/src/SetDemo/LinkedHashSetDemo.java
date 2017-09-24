package SetDemo;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] num = {2,4,1,7,12,9,76,56,43,43,9,27};
		
		Set<Integer> numSet = new LinkedHashSet<Integer>();
		
		Collections.addAll(numSet, num);
		for(Integer i : numSet){
			System.out.println(i);
		}

	}

}
