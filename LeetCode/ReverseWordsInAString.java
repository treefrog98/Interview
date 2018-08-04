public class ReverseWordsInAString {

  public static void main(String[] args) {





  }
  public static String reverseWords(String s) {
       if(s == null || s.length() == 0){
           return "";
       }
       String [] words = s.split(" ");
       StringBuilder reverse = new StringBuilder();
       for(int i = words.length - 1; i >= 0; i--){
           // as long as it is not a space
           if(!words[i].equals("")){
               reverse.append(words[i]).append(" ");
           }
       }
       if(reverse.length() == 0){
           return "";
       }
       else{
           return reverse.substring(0,reverse.length()-1);
       }  
    }
}
