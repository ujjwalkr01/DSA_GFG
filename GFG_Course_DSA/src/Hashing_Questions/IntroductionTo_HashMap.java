package Hashing_Questions;

import java.util.HashMap;
import java.util.Map;

public class IntroductionTo_HashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> mp = new HashMap<>();

		// put() is used to add the key-value pairs in the map
		mp.put("ujjwal", 26);
		mp.put("kumar", 15);
		mp.put("singh", 20);

		System.out.println(mp);

		// size() is used to get the size of the map
		System.out.println(mp.size());

		// entrySet() is used to iterate over the map
		for (Map.Entry<String, Integer> m : mp.entrySet()) {
			// getKey() is used to print the key and 
            //getValue() is used to print the value
			System.out.println(m.getKey() + " " + m.getValue()); 
		}

		// remove() delete the key along with it's value from the map
		mp.remove("kumar");
		System.out.println(mp);

		//containsKey(key) is used to check for the given key whether the key is present in the map or not 
		if (mp.containsKey("ujjwal")) { 
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
		
		//containsValue(Value) is used to check for the given value whether the value is present or not in the map
		if (mp.containsValue(26)) { 
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
		
		//get(Key) is used to print the value for the key passed as a parameter.If the key is not present it prints null 
		System.out.println(mp.get("kumar"));
		System.out.println(mp.get("singh"));
	}

}
