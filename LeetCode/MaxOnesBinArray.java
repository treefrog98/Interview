public class MaxOnesBinArray {

  public static void main(String[] args) {


  }

  public static int maxOnes(int[]arr) {
    int count = 0;
    int max = 0;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == 0) {
        if(count > max) {
          max = count;
        }
        count = 0;
      }
      else {
        count++;
      }
    }
    if(count > max) {
      max = count;
    }
    return max;
  }
}
