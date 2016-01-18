package week0;

import java.util.Scanner;

public class Problem31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		String str = input.nextLine();
		
		System.out.println(countConsonants(str));
	}

	public static int countConsonants(String str) {

		String vowels = "aeiouy";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {

				if (str.charAt(i) != vowels.charAt(j)) {
					count++;
				}
				System.out.println(count);
			}
		}
		return count;
	}

}
