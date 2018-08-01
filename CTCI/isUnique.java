public class isUnique {

  public static void main(String[] args) {

		System.out.println(isUnique("ABC"));
		System.out.println(isUnique("/'2["));
		System.out.println(isUnique("hello"));

  }
  public static boolean isUnique(String s) {
    String new_string = s.toLowerCase();
    int[] occurrences = new int[128];
    for(int i = 0; i < new_string.length(); i++) {
      char c = new_string.charAt(i);
      occurrences[(int) c]++;
      if(occurrences[(int) c] > 1) {
        return false;
      }
    }
    return true;
  }
}
