package InterviewPrograms;

public class PrintPalindrome {

	public static void main(String args[]) {

		String s1 = "mimim";
		String revStr = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			revStr = revStr + s1.charAt(i);
		}

		if (s1.equals(revStr)) {
			System.out.println("The string " + s1 + " is a Palindrome");
		} else {
			System.out.println("The string " + s1 + "is not a Palindrome");
		}
	}

}
