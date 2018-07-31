public class MoveZeroes {

  public static void main(String[] args) {


  }
  public static void moveZeroes(int[] nums) {
       // left pointer
       int fill = 0;

       // i is your right pointer
       for(int i = 0; i < nums.length; i++ ) {
           if(nums[i] != 0){
               int temp = nums[i];
               nums[i] = nums[fill];
               nums[fill] = temp;
               fill++;
           }

       }
  }



}
