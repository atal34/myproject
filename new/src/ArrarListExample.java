
import java.util.*;
public class ArrarListExample {
	


		public static void main(String args[]){
		   ArrayList<String> listofcountries = new ArrayList<String>();
		   listofcountries.add("India");
		   listofcountries.add("US");
		   listofcountries.add("China");
		   listofcountries.add("Denmark");
		   
		   List<String> list1= new ArrayList<String>();
		   System.out.println(list1.getClass());
		   System.out.println(listofcountries.getClass());

		   /*Unsorted List*/
		   System.out.println("Before Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}

		   /* Sort statement*/
		   Collections.sort(listofcountries);

		   /* Sorted List*/
		   System.out.println("After Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}
		}
	}
