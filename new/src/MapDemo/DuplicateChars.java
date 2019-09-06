package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChars {
	
	public static int getfactorial(int num){
		int fact = 1;
		for(int i=1;i<=num;i++){
			fact = fact * i;
		}
		return fact;
	}
	public static int getPermutation(String s,int r){
		int n = s.length();
		int perm = getfactorial(n)/getfactorial(r);
		return perm;
	}
	

	public static void main(String[] args) {

		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		String a = "java";
		System.out.println(a.length());
		
		String s = "IIIAMnewtoJ2EE";
		
		char[] cArray = s.toCharArray();
		
		for( char c : cArray){
			
			if(map.containsKey(c)){
				//map.get(c);
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c, 1);
			}
			
		}
		System.out.println(map);
		System.out.println(getPermutation(a, 2));
	}
	
	

}
