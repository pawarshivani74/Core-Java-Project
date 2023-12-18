package Firstpackage;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int columeCount = 1;
		int n = 6;
		for (int i = n; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");//space
			}

			for (int j = 1; j <= columeCount; j++) {
				System.out.print(columeCount + " ");
			}

			System.out.println();

			columeCount++;
		}
	}

}
