package ListConcept;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Adding elelmets
		Vector<String> vector = new Vector<String>();
		vector.addElement("Shon");
		vector.addElement("Martha");
		vector.addElement("Adil");
		vector.addElement("Ramesh");
		vector.addElement("Karthik");
		System.out.println(vector);

		// Adding element in specified position
		vector.add(3, "Nishan");
		System.out.println("After adding vector in specified position:" + vector);

		Vector<String> vector2 = new Vector<String>();
		vector2.addElement("Nihal");

		// Concatinating two vectors
		vector.addAll(vector2);
		System.out.println("After concatinating vector:" + vector);

		// Displaying the capacity of Vector
		System.out.println("The capacity is: " + vector.capacity());

		// Contains
		System.out.println("Contains:" + vector.contains("Nihal"));

		// Fetching the specific element from the Vector
		System.out.println("The element is: " + vector.elementAt(3));

		// Displaying the Enumeration
		Enumeration enu = vector.elements();
		System.out.println("The enumeration of values are:");
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}

		// Comparing two vector
		System.out.println("Are both of them equal? " + vector.equals(vector2));

		// Displaying the first element
		System.out.println("The first element is: " + vector.firstElement());

		// Fetching the specific element from the Vector
		System.out.println("The element is: " + vector.get(2));

		// Displaying the hashCode value of Vector
		System.out.println("The hashCode value is: " + vector.hashCode());

		// Displaying index of element
		System.out.println("Displaying index of element:" + vector.indexOf("Adil"));

		// Inseting element at 3st position
		vector.insertElementAt("Shekar", 3);
		System.out.println("The final vector is " + vector);

		// Checking vector empty or not
		System.out.println("Is vector is empty? " + vector.isEmpty());

		// Displaying the last element
		System.out.println("The last element is: " + vector.lastElement());

		// The last position of an element is returned
		System.out.println("Last occurrence of 10 is at index: " + vector.lastIndexOf("Adil"));

		// Remove the element using remove()
		String rem_ele = vector.remove(3);
		System.out.println("Removed element: " + rem_ele);
		System.out.println("Final Vector: " + vector);

		// using removeAllElements() method
		vector2.removeAllElements();
		System.out.println("The final Vector: " + vector2);

		// Remove the element at 3rd position
		vector.removeElementAt(3);
		System.out.println("Final Vector: " + vector);

		// Using set() method to replace the element
		System.out.println("The Object that is replaced is: " + vector.set(4, "Karan"));

		// setting new size
		vector.setSize(8);
		System.out.println("\nAfter using setSize()");
		System.out.println("Vector: " + vector);
		System.out.println("Size: " + vector.size());

		// Creating the sublist vector
		List<String> sub_list = new ArrayList<String>();
		// Limiting the values till 5
		sub_list = vector.subList(2, 5);
		// Displaying the list data
		System.out.println("The resultant values within the sub list: " + sub_list);

		// Creating new vector
		Vector<Integer> vector3 = new Vector<Integer>();
		// Use add() method to add elements into the Vector
		vector3.add(10);
		vector3.add(40);
		vector3.add(30);
		vector3.add(20);
		vector3.add(100);
		vector3.add(25);
		// Displaying the Vector
		System.out.println("The Vector: " + vector3);

		// Creating the array and using toArray()
		Object[] arr = vector3.toArray();

		System.out.println("The array is:");
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		// Displaying the string representation
		System.out.println("The String representation is: " + vector3.toString());

		// Displaying the Vector
		System.out.println("Initial size is: " + vector3.size());

		// trims the size to the number of elements
		vector3.trimToSize();

		// Displaying the Vector
		System.out.println("Size after using trimToSize(): " + vector3.size());

	}

}
