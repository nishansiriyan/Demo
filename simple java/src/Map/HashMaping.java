package Map;

import java.util.*;
import java.util.HashMap;

public class HashMaping { 
	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Amar", 50);
		map.put("Ramesh", 80);
		map.put("Archana", null);
		map.put("Sanjana", 50);
		System.out.println("Size of map is:" + map.size());
		// display
		for (Map.Entry pairEntry : map.entrySet()) {
			System.out.println(pairEntry.getKey() + " =" + pairEntry.getValue());
		}

		System.out.println("Serching using Key");
		if (map.containsKey("Amar")) {
			Integer value = map.get("Amar");
			System.out.println("Value of Seraching key is:" + value);
			map.remove("Amar");
		}

		System.out.println("After Delete");
		for (Map.Entry pairEntry : map.entrySet()) {
			System.out.println(pairEntry.getKey() + " =" + pairEntry.getValue());
		}
	}

}
