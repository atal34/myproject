package List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListDemo {
	
	public static void main(String[] args){
		List<String> players = new ArrayList<String>();
		
		players.add("Sachin");
		players.add("Smith");
		players.add("Kohli");
		players.add("Dhoni");
		players.add("Ponting");
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
		System.out.println("\n");
		Set<String> pSet = new HashSet<String>();
		pSet.addAll(players);
		
		Iterator it = pSet.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
