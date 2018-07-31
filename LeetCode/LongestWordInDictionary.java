public class LongestWordInDictionary {

  public static void main(String[] args) {

    


  }
  public static String longestWord(String[] words) {
        HashSet<String> map = new HashSet<String>();
        HashSet<String> memo = new HashSet<String>();
        for (int i = 0; i < words.length; i++) {
            map.add(words[i]);
        }
        int max_index = -1;
        for (int i = 0; i < words.length; i++) {
            boolean valid = true;
            for (int j = 1; valid && j < words[i].length() - 0; j++) {
                String sub = words[i].substring(0, words[i].length() - j);
                if (memo.contains(sub)) {
                    break;
                }
                if (!map.contains(sub)) {
                    valid = false;
                }
            }
            if (valid) {
                memo.add(words[i]);
                if (max_index != -1) {
                    if (words[i].length() > words[max_index].length()) {
                        max_index = i;
                    } else if (words[i].length() == words[max_index].length()) {
                        if (words[i].compareTo(words[max_index]) < 0) {
                            max_index = i;
                        }
                    }
                } else {
                    max_index = i;
                }
            }
        }
        return words[max_index];
    }
}
