package InterviewPrograms;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NoOfCharInString {
    public static void main(String[] args) {
		getCount("lavisha", 1);
	}
	public static void getCount(String str, int n) {
		char charArr[] = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (char c : charArr) {

			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		System.out.println(charMap);
		String values = "";
		for (Entry<Character, Integer> entry : charMap.entrySet()) {
			// if give value is equal to value from entry
			// print the corresponding key
			if (entry.getValue() == n) {
				values = values + "," + entry.getKey();
				// System.out.println("The key for value " + n + " is " + entry.getKey());
			}
		}
		System.out.println("most occuring for value " + n + " is " + values);

	}

}
