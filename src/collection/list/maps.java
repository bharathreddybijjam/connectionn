package collection.list;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class maps {
	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<Integer, String>();
		Map<Integer, String> m1=new TreeMap<Integer, String>();
		m.put(2, "two");
		m.put(3, "three");
		m.put(4, "four");
		m1.put(5,"five");
		m1.put(6, "six");
		System.out.println(m);
		System.out.println(m.get(3));
		System.out.println(m.containsKey(3));
		System.out.println(m.containsValue("three"));
		m.remove(2);
		System.out.println(m);
		System.out.println(m1);
		
	}

}
