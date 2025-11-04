package codingame;

import java.util.ArrayList;
import java.util.HashMap;

public class StreamsSum {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		
		int sum1 = al1.stream().reduce(0, (a,b) -> a+b);
		System.out.println(sum1);
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(2, 3);
		hm.put(1, 2);
		hm.put(4, 1);
		
		int sum2 = hm.entrySet().stream().reduce(0, (sum, entry) -> sum + entry.getKey() * entry.getValue(), Integer::sum );
		System.out.println(sum2);
	}

}
