public class LengthOfLastWord {

  public static void main(String[] args) {

    System.out.println(lengthOfLastWord("Hello my name is Sriram!"));

  }
  public static int lengthOfLastWord(String s) {
    String[] strs = s.trim().split(" ");
    return strs[strs.length-1].length();
  }
}
