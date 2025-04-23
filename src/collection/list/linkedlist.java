package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {
	public static void main(String[] args) {
		List<String> li=new LinkedList<String>();
		li.add("rahul");
		li.add("car take");
		System.out.println(li);
		li.addFirst("chinna rahul");
		System.out.println(li);
		li.addLast("middle rahul");
		System.out.println(li);
		li.removeFirst();
		System.out.println(li);
		li.removeLast();
		System.out.println(li);
	}

}
