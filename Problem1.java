package week0;

import java.util.Scanner;
//you can name your files with the name of task. It will be aesy to find them later
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
