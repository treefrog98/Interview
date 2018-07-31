public class ReverseStringII {

  public static void main(String[] args) {


  }
  public static String reverseStr(String s, int k) {
        StringBuilder string = new StringBuilder();
        boolean rev = true;
        for (int i = 0; i < s.length(); i += k) {
            if (rev) {
                if(i + k <= s.length()) {
                    StringBuilder temp = new StringBuilder(s.substring(i, i + k));
                    string.append(temp.reverse().toString());
                 } else {
                    StringBuilder temp = new StringBuilder(s.substring(i, s.length()));
                    string.append(temp.reverse().toString());
                }
            } else {
                if (i + k <= s.length()) {
                    string.append(s.substring(i, i + k));
                } else {
                    string.append(s.substring(i, s.length()));
                }
            }
            rev = !rev;
        }
        return string.toString();
    }
}
