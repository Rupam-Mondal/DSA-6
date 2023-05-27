package hashing;

import java.util.HashMap;

public class duplicate {
	public static boolean detect(int[] arr) {
		HashMap<Integer , Integer> map = new HashMap<>();
		for(int i = 0 ; i < arr.length ; i++) {
			map.put(arr[i], i);
		}
		for(int i = 0 ; i < arr.length ; i++) {
			if(map.containsKey(arr[i]) && i != map.get(arr[i])) {
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]) {
		int[] arr = {0 ,67 , 3 ,2 , 2};
		System.out.println(" "+detect(arr));
	}
}
