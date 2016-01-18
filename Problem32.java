package week0;

import java.util.HashMap;

public class Problem32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(2, "abc");
		map.put(5, "jkl");
		map.put(3, "def");
		map.put(3, "ghi");
		map.put(4, "ghi");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
		map.put(0, " ");
		
		int[] m = { 4, 5, 1, -8, 9, 7 };
		neshto(5, map);
		
		for(int i=0;i<m.length;i++){
			if(i>0 && m[i-1]==-1){
				
			}
		}
	}

	public static void neshto(int num, HashMap<Integer, String> map) {

		if (map.containsKey(num)) {
			// for(int i=2; i<10;i++){
			String string = map.get(num);
			for (int j = 0; j < string.length(); j++) {
				System.out.print(string.charAt(j) + " ");
			}
			System.out.println();
		}

		// }
	}

}
