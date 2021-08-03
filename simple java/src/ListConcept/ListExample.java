package ListConcept;
import java.util.*;
public class ListExample {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		//Add List
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(5);
		list.add(80);
		//Checking size of list
		System.out.println("Size of list:"+list.size());
		//Iterating list using iterator
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"\t");
		}
		
		//Cheking hash code of list
		System.out.println("\nHash code of list:\n"+list.hashCode());
		
		//checking index of element
		System.out.println("\nIndex of element is:\n"+list.indexOf(30));
		//Contains
		System.out.println("\n"+list.contains(2));
		
		// Replacing element using method set()
        int val = list.set(3, 90);
        System.out.println("After operation: "+ list);
        System.out.println("Replaced element: "+ val);
		
        //Check last index of element
        System.out.println("Last index of element:"+list.lastIndexOf(30));
        
		//Removing Element from the list
		list.remove(2);
		System.out.println("After deleting the element:"+list);
		
		//sorting list
		Collections.sort(list);
		System.out.println();
		System.out.println("After sorting list:"+list);
		
		
		//Converting list to array
		Integer[] intArray = new Integer[list.size()];
		intArray =list.toArray(intArray );
		System.out.println("Afetr Converting List to array:");
		for(Integer i:intArray) {
			System.out.print(i+"\t");
		}
		
		//Converting array to List
		Integer[] arrays= {1,4,3,2,5};
		List<Integer> sourceList = new ArrayList<>();
		sourceList=Arrays.asList(arrays);
		System.out.println("\nAfter Converting Array to List");
		System.out.println(sourceList);
		
		
		//Displaying sub list
		System.out.println(list);
		System.out.println("Displaying sub list:"+list.subList(1, 3));
		
		//clearing the list
		list.clear();
		
		//checking is empty
		System.out.println(list.isEmpty());
		
	}
}
