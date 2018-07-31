public class MissingNumber {

  public static void main(String[] args) {

    int [] arr = {3,0,1};
    System.out.println(missingNumber(arr));



  }
  public static int missingNumber(int[] arr) {
    boolean[] arr = new boolean[nums.length + 1];
       //Arrays.fill(arr,false);
       for (int i = 0; i < nums.length; i++) {
           arr[nums[i]] = true;
       }
       for (int i = 0; i < arr.length; i++) {
           if (!arr[i]) {
               return i;
           }
       }
       return -1;
  }





}
