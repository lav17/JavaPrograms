package InterviewPrograms;

public class TotalWordsInString {
	
	public static void totalWords(String str) {
		
		String[] words = str.split(" ");
		
		System.out.println(words.length);

	}

	public static void main(String[] args) {
		
		totalWords("my name is java test ng");

	}

}
