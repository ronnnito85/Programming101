package week0;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new java.util.Scanner(System.in);

		int[] m = { 4, -5, 8, 9, -4, 0 };
		int k = input.nextInt();

		System.out.println(kthminEl(m, k));
	}

	public static int kthminEl(int array[], int k) {

		int n = 0;
		int[] array1 = new int[k];
		while (k != 0) {
			for (int i = 0; i < array.length; i++) {

				if (array[i] < n && ) {
					n = array[i];
					;
				}
			}

			k--;
		}
		return n;

	}
}