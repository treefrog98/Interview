public class LargestAtleastTwice {

  public static void main(String[] args) {



  }
  public static int dominantIndex(int[] nums) {

        int max = -1;
        int maxIndex = -1;

        // first figure out the max
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }
        int secondMax = -1;
        // figure out the second max
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != max && secondMax < nums[i]){
                secondMax = nums[i];
            }
        }
        if(max >= (2*secondMax)){
            return maxIndex;
        }
        return -1;
    }
}
