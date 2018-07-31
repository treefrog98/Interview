public class ContainsDuplicate {

  public static void main(String[] args) {

    int [] arr = {1,2,3,4,5,4};
    System.out.println(containsDuplicate(arr));

  }
  public static boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        Set<Integer> numbers = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(numbers.contains(nums[i])) {
                return true;
            }
            else{
                numbers.add(nums[i]);
            }
        }
        return false;
    }
}
