package week0;

import java.util.Scanner;

public class Problem19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new java.util.Scanner(System.in);

		String str = input.nextLine();
		
		System.out.println(isPalindrom(str));

	}
	
	public static boolean isPalindrom(String word){
		
		for( int i = 0; i < word.length()/2; i++ )
	        if (word.charAt(i) != word.charAt(word.length()-i-1)) 
	        	return false;
	    return true; 
		
	}

}
