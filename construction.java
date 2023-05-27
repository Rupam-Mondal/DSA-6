package hashing;

import java.util.HashMap;

public class construction {
	public static boolean find(String s1 , String s2) {
		HashMap<Character , Integer> map = new HashMap<>();
		for(int i = 0 ; i < s1.length() ; i++) {
			map.put(s1.charAt(i), 1);
		}
		for(int i = 0 ; i < s2.length() ; i++) {
			if(map.containsKey(s2.charAt(i))) {
				map.put(s2.charAt(i), map.get(s2.charAt(i)) + 1);
			}
			else {
				map.put(s2.charAt(i), 1);
			}
		}
		for(int i = 0 ; i < s1.length() ; i++) {
			if(map.get(s1.charAt(i)) == 1) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		String s1 = "abc";
		String s2 = "acb";
		System.out.println(" "+find(s1 , s2));
	}
}
