package collection.list;

import java.util.ArrayList;
import java.util.List;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class fruitmarket {
	public static void main(String[] args) {
		List<String> fruits=new ArrayList<String>();
		ArrayList<String> vegtables=new ArrayList<String>();

        // Adding initial fruits
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        System.out.println("Initial Fruit List: " + fruits);

        // Using for-loop (1st approach)
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Using forEach (2nd approach)
        fruits.forEach(fruit -> {
            System.out.println(fruit);
        });

        // Using Iterator
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using ListIterator (Reverse Order)
        ListIterator<String> listIterator = fruits.listIterator(fruits.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // Adding a fruit at a specific index
        fruits.add(1, "Grapes");
        System.out.println("After adding Grapes: " + fruits);

        // Removing a fruit by index
        fruits.remove(2);
        System.out.println("After removing index 2: " + fruits);

        // Adding extra fruits
        vegtables.add("Tomato");
        vegtables.add("Chilly");
        vegtables.add("Carrot");
        System.out.println("Vegtables: " + vegtables);

        // Merging extra fruits into the main list
        fruits.addAll(vegtables);
        System.out.println("After merging vegtables: " + fruits);

        // Sorting the fruit list
        Collections.sort(fruits);
        System.out.println("After sorting: " + fruits);

        // Checking if the list is empty
        System.out.println(fruits.isEmpty());

        // Getting the size of the list
        System.out.println(fruits.size());

        // Modifying a specific element
        fruits.set(1, "Strawberry");
        System.out.println(fruits);

        // Checking for an element
        System.out.println(fruits.indexOf("Mango"));
        System.out.println(fruits.contains("Kiwi"));
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(5));
        List<String> selectedFruits = fruits.subList(0,2); // Get only Apple and Grapes
        System.out.println(selectedFruits);


        // Clearing the list
        fruits.clear();
        System.out.println(fruits);
    }

	}


