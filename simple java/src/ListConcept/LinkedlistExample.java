package ListConcept;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedlistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		// Adding list
		list.add("Nishan");
		list.add("sajan");
		list.add("Jithesh");
		list.add("Sudheesh");
		list.add(1, "Jayaraj");
		list.add(2, "Mahesh");
		System.out.println(list);

		// Adding first
		list.addFirst("Chethan");
		System.out.println("Adding element to first position of list\n" + list);

		// Adding last
		list.addLast("Kavya");
		System.out.println("Adding element to last position of list\n" + list);

		// Retriving first element
		System.out.println("First element of the list is:" + list.getFirst());

		// Retriving last elemt
		System.out.println("Last element of the list is:" + list.getLast());

		// Removing the elelment;
		list.remove("Sudheesh");
		System.out.println("After removing element in the list:" + list);

		// Removing first element:
		list.removeFirst();
		System.out.println("Removing first element of the list:" + list);

		// Removing element using object:
		list.remove(2);
		System.out.println("Removing using oblect::" + list);
		// Removing last element
		list.removeLast();
		System.out.println("Removing last element of the list:" + list);

		// Contains
		System.out.println("Check element:" + list.contains("sajan"));

		// Fetching elements using get method
		System.out.print("Fetching elements using get method:");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}

		// Displaying the element index
		System.out.println("\nDisplaying element index:" + list.indexOf("Jithesh"));

		// offering a new element
		// adds element at tail.
		list.offer("Astha");
		System.out.println("adds element at tail:" + list);

		// This method inserts the specified element at the front of this list.
		list.offerFirst("Narendra");
		System.out.println("LinkedList after insertion using offerFirst() : " + list);

		// peek at the head of the list
		System.out.println("Head of the list : " + list.peek());

		// pop
		System.out.println("Pops an element from the stack represented by this list : " + list.pop());

		// push
		list.push("Ramesh");
		System.out.println("Push an element from the stack represented by this list : " + list);

		// setting an element to required place
		list.set(3, "Ramya");
		System.out.println("Afetr setting an element in the list:" + list);

		// Converting list to array
		Object[] array = list.toArray();
		System.out.println("Returned Array: " + Arrays.toString(array));

	}

}
