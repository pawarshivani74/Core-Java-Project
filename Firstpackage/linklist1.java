package Firstpackage;

import java.util.LinkedList;

public class linklist1 {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("thar");

		// Use getLast() to display the last item in the list
		System.out.println(cars.getLast());
		System.out.println(cars);
		System.out.println(cars.getFirst());

	}
}
