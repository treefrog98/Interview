public class MostCommonWord {

  public static void main(String[] args) {


  }
  public String mostCommonWord(String paragraph, String[] banned) {
       // Create a set of banned words
       Set<String> bannedWords = new HashSet<String>();
       for(int i = 0; i < banned.length; i++) {
           bannedWords.add(cleanUp(banned[i]));
       }
       String[] words = paragraph.split(" ");
       String result = "";
       int max = -1;
       HashMap<String, Integer> map = new HashMap<String, Integer>();
       for(int i = 0; i < words.length; i++) {
           words[i] = cleanUp(words[i]);
           // if it's not in the banned words set, then you can put in hashmap and incrememnt by one as you see fit
           if(!bannedWords.contains(words[i])) {
               // If it's been in hashmap -- if it has, then increment the integer, if not put it in the hashmap with value 1
               if(!map.containsKey(words[i])) {
                   map.put(words[i],1);
                   if(1 > max) {
                       result = words[i];
                       max = 1;
                   }
               }
               // if it has been in the hashmap, then we increment the integer (update it)
               else {
                  int val = map.get(words[i]);
                  map.replace(words[i], val, val+1);
                   if (val + 1 > max) {
                       result = words[i];
                       max = val + 1;
                   }
               }
           }
       }
       return result;
   }

   // Get rid of punctuation, spaces
   public static String cleanUp(String word) {
       word = word.trim().toLowerCase();
       char c = word.charAt(word.length()-1);
       // if it's some sort of punctuation
       if (c == '!' || c == '?' || c == '\'' || c == ';' || c == '.' || c == ',') {
           word = word.substring(0, word.length() - 1);
       }
       return word;
   }
}
