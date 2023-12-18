package Firstpackage;

import java.util.Scanner;

public class sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		int a[] = new int[5];
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter an Array: ");
			for (i = 0; i < 5; i++) {

				a[i] = s.nextInt();
			}
		}
		System.out.println("Elements after sorting is: ");
		for (j = 0; j < 5; j++) {
			for (k = j; k < 5; k++) {
				if (a[j] > a[k]) {
					a[j] = a[j] + a[k];
					a[k] = a[j] - a[k];
					a[j] = a[j] - a[k];

				}
			}

			System.out.println(a[j]);
		}
	}

}
