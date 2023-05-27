package hashing;

import java.util.HashMap;

public class majority {
	public static int major(int[] arr) {
		HashMap<Integer , Integer> map = new HashMap<>();
		for(int i = 0 ; i < arr.length ; i++) {
			map.put(i, arr[i]);
		}
		int max = arr[0];
		for(int i = 0 ; i < arr.length ; i++) {
			if(map.get(i) > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String args[]) {
		int[] arr = {4 , 2 , 7 , 44 , 9};
		System.out.println(major(arr));
	}
}
