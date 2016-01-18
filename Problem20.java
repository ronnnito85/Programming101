package week0;

import java.util.Scanner;

public class Problem20 {

	public static void main(String[] args) {

		Scanner input = new java.util.Scanner(System.in);

		int n = input.nextInt();

		System.out.println(isPalindrom(n));

	}

	public static boolean isPalindrom(int n) {

		int pal = 0;
		
		while (n != 0) {

			pal += n % 10;
			pal *= 10;
			n = n / 10;

		}
		System.out.println(pal);

		if (n != pal) {
			return false;
		}
		return true;

	}

}