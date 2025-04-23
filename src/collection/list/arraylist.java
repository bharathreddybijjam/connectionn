package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


import java.util.ListIterator;

public class arraylist {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		li.add(52);
		li.add(23);
		li.add(74);
		System.out.println(li);
//		for----1st type
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
//		for each approach-----2nd type
		li.forEach(e->{
			System.out.println(e);
		});
//	rahul	
		for(int i:li) {
			System.out.println("=========");
			System.out.println(i);
		}
//		literator approach
		Iterator<Integer> i=li.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
//		List iterator
		ListIterator<Integer> i1=li.listIterator(li.size());
		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}
		li.add(1,53);
		System.out.println(li);
		li.remove(2);
		System.out.println(li);
		al.add(10);
		al.add(11);
		al.add(12);
	/*	System.out.println(al);
		li.addAll(al);
		System.out.println(li);
		li.addAll(2,al);
		System.out.println(li);
		li.removeAll(al);
		System.out.println(li);
		Collections.sort(li);*/
		System.out.println(li);
		System.out.println(li.isEmpty());
		System.out.println(li.size());
//		set is used to modify elements (first element is index value and ending element is set value
		li.set(1, 96);
		System.out.println(li);
		System.out.println(li.indexOf(90));
		System.out.println(li.contains(90));
//		to clear all the database
		li.clear();
		System.out.println(li);

	}

}
