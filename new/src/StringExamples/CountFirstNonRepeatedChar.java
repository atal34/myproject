package StringExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountFirstNonRepeatedChar {

	public static void main(String[] args) {

		String input = "SampleStringS";
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		
		
		for(int i=0;i<input.length();i++){
			if(map.containsKey(Character.toString(input.charAt(i)))){
				int a = map.get(Character.toString(input.charAt(i)));
				a = a+1;
				map.put(Character.toString(input.charAt(i)), a);
			}
			else{
				map.put(Character.toString(input.charAt(i)), 1);
			}
		}
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
		//Iterator it = ;
		
		while(itr.hasNext()){
			
			Map.Entry<String, Integer> entry = itr.next(); 
            System.out.println("Key = " + entry.getKey() +  
                                ", Value = " + entry.getValue());
			
			//System.out.println();
		}
		
	}

}
