public class PowerOfThree {

  public static void main(String[] args) {


  }
  public static boolean powerOfThree(int num) {
    if (num <= 0) {
           return false;
       }
       return (Math.log10(num) / Math.log10(3)) % 1 == 0;
  }
}
