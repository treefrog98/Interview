public class AddBinary {

  public static void main(String[] args) {

  }
  public static String AddBinary(String a, String b) {
    return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
  }
}
