package SetDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] num = {2,4,2,6,7,8,9,8,9,2,1,0};
		Integer[] num1;
		
		List <Integer> numList = new ArrayList<Integer>();
		System.out.println(num[0]);
		/* We cannot add elements as this will return an arralist of fixed size 
		 * UnsupportedOperationException will be thrown */
		//numList = Arrays.asList(num);
		
		/* By using collections.addAll we are creating a copy of the array and it can be modified without
		 * affecting the original array 
		 * Also we can add elememts */
		Collections.addAll(numList, num);
		
		for(Integer i : numList){
			System.out.println(i);
		}
		System.out.println("\n");
		numList.set(0, 6);
		numList.add(400);
		for(Integer i : numList){
			System.out.println(i);
		}
		System.out.println(num[0]);
		numList.add(0);
		

	}

}
