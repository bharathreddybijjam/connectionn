package collection.list;

import java.util.HashSet;

public class set {
	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		HashSet<String> hs=new HashSet<String>();
		//		set do not allow duplicate values
		h.add("Bharath");
		h.add("Cse");
		h.add("Bharath");
		hs.add("giet");
		hs.add("21551A0514");
		hs.add("degree");
		hs.addAll(h);
		System.out.println(hs.size());
		h.addAll(hs);
//		h.equals("cse");
//		hashset,linked hashset
		System.out.println(h);
		System.out.println(h.isEmpty());
		System.out.println(h.containsAll(hs));
		System.out.println(hs);
//		System.out.println(h.clone());
//		h.clone();
	}
}
