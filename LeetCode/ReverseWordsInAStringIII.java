public class ReverseWordsInAStringIII {

  public static void main(String[] args) {

  }
  public static String reverseWords(String s) {
    if(s == null || s.length() == 0 ) {
      return "";
    }
    StringBuilder newString = new StringBuilder();
    String [] split = s.split(" ");
    for(int i = 0; i < split.length; i++) {
      newString.append(split[i]).append(" ");
    }
    String temp = newString.reverse().toString();
    String [] newSplit = temp.split(" ");
    StringBuilder ans = new StringBuilder();
    for(int i = newSplit.length-1; i >= 0; i--) {
      ans.append(newSplit[i]).append(" ");
    }
    if(ans.length() == 0) {
       return "";
    }
    return ans.substring(0,ans.length()-2);
  }
}
