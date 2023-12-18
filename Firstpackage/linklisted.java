package Firstpackage;

import java.util.Iterator;
import java.util.LinkedList;

public class linklisted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.addFirst(23);
		ll.add(6);
		ll.offerLast(50);
		// ll.addLast(40);
		System.out.println("Element in Lined List : " + ll);
		System.out.println("Element in pullfirst : " + ll.pollFirst());
		System.out.println("Element in Lined List : " + ll);
		System.out.println("Element in pullfirst : " + ll.peekFirst());
		// System.out.println("Element in Lined List : "+ll.getFirst());
//		System.out.println("Element in peekfirst Linked List : "+ll.peekFirst());
		System.out.println("Element in Linked List using Iterator :");
		Iterator<Integer> iter = ll.descendingIterator();
	    while (iter.hasNext()) {
	      int i = iter.next();
	       System.out.println(i);
	    }
		
	    }
	}

	


