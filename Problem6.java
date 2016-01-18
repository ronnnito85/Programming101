package week0;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new java.util.Scanner(System.in);

		int n = input.nextInt();

		System.out.println(doubFacture(doubFacture(n)));
	}

	public static int doubFacture(int num) {

		int facture = 1;

		while (num > 0) {

			facture *= num;
			num--;

		}

		//doubFacture(facture);
		return facture ;
	}
}
