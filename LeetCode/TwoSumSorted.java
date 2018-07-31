public class TwoSumSorted {

  public static void main(String[] args) {




  }
  public static int[] twoSum(int[] numbers, int target) {
        int [] arr = new int[2];
        // first find the index it is less than
        int leftBound = 0;
        int rightBound = numbers.length-1;

        while(numbers[leftBound] + numbers[rightBound] != target && leftBound < rightBound){
            if(numbers[rightBound] + numbers[leftBound] < target){
                leftBound++;
            }
            else{
                rightBound--;
            }
        }
         arr[0] = leftBound+1;
         arr[1] = rightBound+1;
        return arr;

    }

}
