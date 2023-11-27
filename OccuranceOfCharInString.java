package InterviewPrograms;

public class OccuranceOfCharInString {

	public static void main(String[] args) {
		String str = "87htjWsuyt78oiu8";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if ((str.charAt(i) > 63 && str.charAt(i) < 90) || (str.charAt(i) > 97 && str.charAt(i) < 122)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
