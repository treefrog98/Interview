public class SingleNumber {

  public static void main(String[] args) {


  }
  public static int singleNumber(int[] arr) {
    int res = 0;
    for(int i = 0; i < arr.length; i++) {
      res ^= arr[i];
    }
    return res;
  }
}
