package SetsConcept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String args[]) {
		 Set<String> hashSet = new HashSet<String>();
		 //Adding elements to the sets
		  hashSet.add("Arun");
		  hashSet.add("Mitun");
		  hashSet.add("Raguram");
		  hashSet.add("Sandya");
		  hashSet.add("Srpitha");
		  System.out.println(hashSet);
		  
		  Integer array1[]= {0,1,2,3,4,5};
		  Integer array2[]= {4,5,6,7};
		  
		  Set<Integer>set1=new HashSet<>();
		  Set<Integer>set2=new HashSet<>();
		  //Adding arrays to sets
		  set1.addAll(Arrays.asList(array1));
		  System.out.println("Set1:"+set1);
		  set2.addAll(Arrays.asList(array2));
		  System.out.println("Set1:"+set2);
		  
		  //Finding union
		  set1.addAll(set2);
		  System.out.println("Union is:"+set1);
		  
		  //Finding Intersection
		  set1.retainAll(set2);
		  System.out.println("Intersection is:"+set1);
		
		  //Finding Difference
		  Set<Integer>set3=new HashSet<>();
		  Set<Integer>set4=new HashSet<>();
		  set3.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
		  set4.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
		  set3.removeAll(set4);
		  System.out.println("Difference of the two Set:"+set3);
		  
		  
	}
}
