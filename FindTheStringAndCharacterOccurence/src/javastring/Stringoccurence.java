package javastring;

import java.util.HashMap;

public class Stringoccurence {

	public static void findstringoccurence(String str) {
		String[] s = str.split(" ");
		HashMap<String, Integer> hm = new HashMap<>();
		for (String tempstring : s) {
			if (hm.get(tempstring) != null) {
				hm.put(tempstring, hm.get(tempstring) + 1);

			} else {
				hm.put(tempstring, 1);
			}

		}
		System.out.println(hm);

	}

	public static void findduplicatecharacter(String str1) {
		HashMap<Character, Integer> hm1 = new HashMap<>();
		// for (int i = 0; i < str1.length(); i++) {
		// Character ch = str1.charAt(i);
		// if (hm1.get(ch) != null) {
		// hm1.put(ch, hm1.get(ch) + 1);
		// } else {
		// hm1.put(ch, 1);
		// }
		//
		// }
		char[] ch = str1.toCharArray();
		for (char c : ch) {
			if (hm1.get(c) != null) {
				hm1.put(c, hm1.get(c) + 1);

			} else {
				hm1.put(c, 1);

			}

		}
		System.out.println(hm1);

	}

	public static void main(String[] args) {
		findstringoccurence("Java Java  is is a  programming language language");
		findduplicatecharacter("manasa");

	}

}
