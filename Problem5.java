package week0;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] m = { 4, 5, 1, -8, 9, 7 };

		System.out.println( avarage(m));
		
	}
	
		public static int avarage(int array[]){
			
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {

			sum += array[i];
		}
		int avarage = sum / array.length;
		
		return avarage;
	
		}
}
