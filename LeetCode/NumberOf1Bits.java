public class NumberOf1Bits {

  public static void main(String[] args) {



  }
  // you need to treat n as an unsigned value
  public static int hammingWeight(int n) {
     if(n == 0){
        return 0;
      }
      int count = 0;
      for(int i = 0; i < 32; i++) {
        if((n & 1) == 1) {
            count ++;
        }
        n >>=1;
      }
      return count;
    }
}
