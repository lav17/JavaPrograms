package InterviewPrograms;

import java.util.Arrays;

public class Anagrams {
	public static boolean isAnagram(String s1, String s2) {

		String str1 = s1.replaceAll("//s", "");
		String str2 = s2.replaceAll("//s", "");

		if (str1.length() != str2.length()) {
			return false;
		} else {
			char[] strCA1 = str1.toLowerCase().toCharArray();
			char[] strCA2 = str2.toLowerCase().toCharArray();

			Arrays.sort(strCA1);
			Arrays.sort(strCA2);

			return Arrays.equals(strCA1, strCA2);

		}

	}

	public static void main(String[] args) {

		System.out.println(isAnagram("MATEu", "TAME"));

	}

}
