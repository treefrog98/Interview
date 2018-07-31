public class HappyNumber {

  public static void main(String[] args) {



  }

  public static boolean isHappy(int n) {
       if(n <= 0) {
            return false;
        }
        Set<Integer> set = new HashSet<Integer>();
        int sum;
        do{
            if (set.contains(n)) {
                return false;
            } else {
                set.add(n);
            }
            sum = 0;
            while (n >= 1) {
                sum += (n%10) * (n%10);
                n = n/10;
            }
            n = sum;
        } while(sum != 1);
        return true;
  }
}
