public class Array_PartitionI {

  public static void main(String[] args) {

    int [] arr = {1,4,3,2};
    System.out.print(arrayPairSum(arr));


  }

  public static int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int maxSum = 0;
    for(int i = 0; i < nums.length; i+=2){
        maxSum += min(nums[i], nums[i+1]);
    }
    return maxSum;
  }

  public static int min(int a, int b) {
    return (a > b) ? b : a;
  }

}
