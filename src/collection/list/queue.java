package collection.list;

import java.util.LinkedList;
import java.util.Queue;


public class queue {
	public static void main(String[] args) {
		Queue<String> q=new LinkedList<String>();
		q.add("list");
		q.add("linked");
		q.add("appear");
		q.add("first");
		System.out.println(q);
		System.out.println(q.peek());
//		System.out.println(q.poll());
		System.out.println(q.isEmpty());
		System.out.println("list");
		System.out.println(q);
		System.out.println(q.size());
	}

}
