public class ReverseString {

  public static void main(String[] args) {

    System.out.print(ReverseString("hello"));

  }

  public static String ReverseString(String s) {
    return new StringBuilder(s).reverse().toString();
  }

}
