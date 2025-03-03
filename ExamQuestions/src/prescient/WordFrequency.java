package prescient;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog.";
		
		input=input.toLowerCase().replaceAll("^a-b0-9", "");
		
		String[] wordArr = input.split("\\s+");
		
		Map<String,Integer> wordCount = new HashMap<>();
		
		for(String word: wordArr) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);
				//wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
			}else{
				wordCount.put(word, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry: wordCount.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
