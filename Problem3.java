package week0;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] m = { 4, 5, 1, -8, 9, 7 };
		
		System.out.println(minEl(m));
	}

	public static int minEl( int array[]){
		
		int k =0;
		
		for(int i=0;i<array.length;i++){
			
			if (array[i]<k){
			k=array[i];
			}
		}
		return k;
		
	}
}
