package accessspecifiers;

public class abstrac {
	// Abstract class representing a Fruit
	abstract class Fruit {
	    // Abstract method to get the name of the fruit
	    public abstract String getName();

	    // Concrete method to display a general message about the fruit
	    public void displayMessage() {
	        System.out.println("This is a delicious fruit.");
	    }
	}

	// Concrete class representing an Apple
	class Apple extends Fruit {
	    @Override
	    public String getName() {
	        return "Apple";
	    }
	}

	// Concrete class representing an Orange
	class Orange extends Fruit {
	    @Override
	    public String getName() {
	        return "Orange";
	    }

	    // Overriding the displayMessage method to provide a specific message for oranges
	    @Override
	    public void displayMessage() {
	        System.out.println("This is a juicy orange.");
	    }
	}

	// Main class to test the Fruit hierarchy
	public class abstrac  {
	    public static void main(String[] args) {
	        // Creating an Apple
	        Fruit apple = new Apple();
	        System.out.println("Fruit: " + apple.getName());
	        apple.displayMessage();
	        System.out.println();

	        // Creating an Orange
	        Fruit orange = new Orange();
	        System.out.println("Fruit: " + orange.getName());
	        orange.displayMessage();
	    }
	    
	}
}
	




