import java.util.HashMap;
import java.util.Map;

public class ArrayNumOccuranceCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,2,4,1,4,6,7,4,3,2,5,4,3,2,6,49,49};
		
		Map<Integer,Integer> counterMap = new HashMap<Integer,Integer>();
		
		for (int i=0;i<arr.length;i++){
			if (counterMap.containsKey(arr[i])){
				int temp = counterMap.get(arr[i]);
				counterMap.put(arr[i], temp+1);
				
			}
			else{
				counterMap.put(arr[i], 1);
			}
		}
		
		System.out.println(counterMap);

	}

}
