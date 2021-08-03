package Map;

import java.util.*;

public class LinkedHashMapping {

	static Map<Integer, Integer> addMap() {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		int num;
		int val[];
		System.out.println("How many number you want to enter:");
		num = sc.nextInt();
		val = new int[num];
		for (int i = 0; i < val.length; i++) {
			System.out.println("Enter the key:");
			int key = sc.nextInt();
			System.out.println("Enter the value:");
			int value = sc.nextInt();
			map.put(key, value);
		}
		return map;
	}

	static void display(Map map) {
		System.out.print(map);
	}

	static void delete(Map map) {
		Scanner sc = new Scanner(System.in);
		int key;
		System.out.println("\nEnter the key to delete value:");
		key = sc.nextInt();
		if (map.containsKey(key)) {
			map.remove(key);
		}
	}

	public static void main(String[] args) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		map = addMap();
		display(map);
		delete(map);
		System.out.println("\nAfter Delete:");
		display(map);
		map.clear();
		System.out.println(map);
	}

}
