package Firstpackage;
import java.util.HashSet;
import java.util.Iterator;
public class hashset1 {

	public static void main(String[] args) {
		   
		        HashSet<Integer> evenNumbers = new HashSet<>();
		        evenNumbers.add(2);
		        evenNumbers.add(4);
		        evenNumbers.add(5);
		        evenNumbers.add(8);
		        System.out.println("HashSet1: " + evenNumbers);

		        HashSet<Integer> numbers = new HashSet<>();
		        numbers.add(1);
		        numbers.add(3);
		        System.out.println("HashSet2: " + numbers);

		        // Union of two set
		        numbers.addAll(evenNumbers);
		        System.out.println("Union is: " + numbers);
		        evenNumbers.retainAll(evenNumbers);
		        System.out.println("Intersection is: " + evenNumbers);
		        
		        
		        // Difference between HashSet1 and HashSet2
		        evenNumbers.removeAll(evenNumbers);
		        System.out.println("Difference : " + evenNumbers);
		        
		        // Calling iterator() method
		        Iterator<Integer> iterate = numbers.iterator();
		        System.out.print("HashSet using Iterator: ");
		        // Accessing elements
		        while(iterate.hasNext()) {
		            System.out.print(iterate.next());
		            System.out.print(", ");
		        }
		    }


	}

