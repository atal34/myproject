package SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEntryTest {

	public static void main(String[] args) {

		Set<BeanSet> set = new HashSet<BeanSet>();
		
		BeanSet bs1 = new BeanSet(1, 28);
		BeanSet bs2 = new BeanSet(1, 28);
		
		set.add(bs1);
		set.add(bs2);
		
		Iterator<BeanSet> it = set.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next().age);
		}
		
		
	}

}
