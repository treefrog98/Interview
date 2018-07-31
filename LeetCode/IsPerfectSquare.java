public class IsPerfectSquare {

  public static void main(String[] args) {

    System.out.println(isPerfectSquare(100));


  }
  public static boolean isPerfectSquare(int num) {
    for(int i = 0; i <= num/2; i++) {
      if(i*i == num) {
        return true;
      }
    }
    return false;
  }
}
