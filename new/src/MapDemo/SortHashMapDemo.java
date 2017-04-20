package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> hmap = new HashMap<>();
		
		hmap.put(1, "Maruti");
		hmap.put(22, "Mercedes");
		hmap.put(20,"ferrari");
		hmap.put(6,"ford");
		hmap.put(2, "honda");
		
		System.out.println(" The hashmap befor sorting is \n");
		System.out.println(hmap);
		
		Map<Integer, String> sortedMap= new TreeMap<>(hmap);
		
		System.out.println(" The hashmap after sorting is \n");
		System.out.println(sortedMap);
		
	}

}
