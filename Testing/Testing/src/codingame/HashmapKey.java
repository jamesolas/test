package codingame;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashmapKey {

	public static void main(String[] args) {
		String t = "test";
		String u = "test";
		
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put(t, 1);

		for(Map.Entry<String, Integer> entry : hm.entrySet()) {
			if(entry.getKey().equals(u)) {
				System.out.println("match");
			}
		}
		
		
		HashMap<Integer,String> fruits = new HashMap<>();
		fruits.put(2,"banana");
		fruits.put(3, "apple");
		fruits.put(1, "kiwi");
		
		System.out.println(fruits);
		
		HashMap<Integer,String> fruits2 = fruits.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b)-> a, HashMap::new));
		
		System.out.println(fruits2);
		
	}

}
