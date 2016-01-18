package week0;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new java.util.Scanner(System.in);

		while (true) {
			int n = input.nextInt();

			System.out.println(isOdd(n));
		}
	}

	public static boolean isOdd(int n) {

		if (n % 2 != 0) {
			return true;
		} else {
			return false;
		}

	}
}