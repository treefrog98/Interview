import java.util.HashMap;

public class string_compression{


	public static void main(String[] args) {

		System.out.println(actual_compression("aabcccccaaa"));

	}

	public static String compression_different(String word) {
		String answer = "";
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i = 0; i < word.length(); i++) {
			if(!map.containsKey(word.charAt(i))) {
				map.put(word.charAt(i), 1);
			}
			else {
				map.replace(word.charAt(i), map.get(word.charAt(i))+1);
			}
		}
		System.out.println(map.values());
		for(Character letter : map.keySet()) {
			answer += letter;
			answer += map.get(letter);
		}

		if(answer.length() > word.length()) {
			return word;
		}
		return answer;
	}
	public static String actual_compression(String word) {
		String answer = "";
		int occurrences = 0;
		for(int i = 0; i < word.length(); i++) {
			occurrences +=1;
			if(i+1 >= word.length() || word.charAt(i) != word.charAt(i+1)) {
				answer += word.charAt(i);
				answer += occurrences;
				occurrences = 0;
			}
		}
		return answer;
	}

}
