package Firstpackage;

public class clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = {1,3,2,3,4,8,6,7,8,9};
		int cloneArray[] = intArray.clone();
		// Deep copy is created following print statement will print false
		System.out.println(intArray == cloneArray);
		for (int i = 0; i < cloneArray.length; i++) { 
		System.out.print(cloneArray[i]+" ");
		}
	}

}
