package SetsConcept;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class LinkedHashSetExample {
	public static void main(String args[]) {
		Set<String> lset = new LinkedHashSet<String>();
		lset.add("Shravan");
        lset.add("Hemanth");
        lset.add("Akil");
        lset.add("Shravan");
        
        System.out.println(lset);
        
        // using remove()
        lset.remove("Shravan");
        System.out.println("Set after removing Shravan:" + lset);
        
     // Iterating over linked hash set items
        System.out.println("Iterating over set:");
        Iterator<String> iterator = lset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
       System.out.println("============Tree Set===================");
        Set<String> tset = new TreeSet<String>();
        tset.add("Manoj");
        tset.add("Abdul");
        tset.add("Narayan");
        System.out.println(tset);
     // Iterating over linked hash set items
        System.out.println("Iterating over set:");
        Iterator<String> iterator2 = tset.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
	}
}
