package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args){
		List<String> players = new ArrayList<String>();
		
		players.add("Sachin");
		players.add("Smith");
		players.add("Kohli");
		players.add("Dhoni");
		players.add("Ponting");
		
		for (int i=0;i<players.size();i++){
			System.out.println(players.get(i));
			
		}
		System.out.println("\n");
		
		for (String p : players){
			System.out.println(p);
		}
		System.out.println("\n");
		
		Iterator i = players.iterator();
		while (i.hasNext()){
			System.out.println(i.next());
		}
	}

}
