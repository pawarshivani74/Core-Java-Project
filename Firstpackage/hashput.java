package Firstpackage;

import java.util.Hashtable;

public class hashput {

	public static void main(String[] args) {

		Hashtable<Integer, String> h=new Hashtable<Integer, String>();
		
		h.put(1,"c++");
		h.put(2,"Java");
		h.put(3,"vstudio");

		System.out.println("Hashtable Elements: " +h);
	}
}
