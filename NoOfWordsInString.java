package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class NoOfWordsInString {
	
	public static void getWordCount(String str) {
		
		String[] wordArray = str.split(" ");
		
		Map<String,Integer> wordMap = new HashMap<String,Integer>();
		
		for(String word : wordArray) {
			if(wordMap.containsKey(word)) {
				wordMap.put(word, wordMap.get(word) + 1);
			}else {
				wordMap.put(word, 1);
			}
					
		}
		System.out.println(wordMap);
		
	}

	public static void main(String[] args) {
		getWordCount("mother beetel bugs had bady bugs bugs java");		

	}

}
