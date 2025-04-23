package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collectiosnda {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,9,6));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		int index=Collections.binarySearch(list, 4);
		System.out.println(index);
		
		Collections.swap(list, 0,list.size()-1);
		System.out.println(list);
		List<Integer> list2=new ArrayList<>(Arrays.asList(10,20,30,40,50,60));
		System.out.println(list2);
		Collections.fill(list2, 90);
		System.out.println(list2);
		List<String> list3=new ArrayList<>(Arrays.asList("ktp","tlr","vtp","ggv","drs","fds","dfds"));
//		Collections.copy(list3, list2);
		System.out.println(list3);
		System.out.println(list2);
//		Collections.frequency(list2, 99);
		System.out.println(	Collections.frequency(list2, 99));
		
	}

}
