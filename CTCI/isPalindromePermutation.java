public class isPalindromePermutation {

	public static void main(String[] args) {

		System.out.println(isPalindromePermutation(count_Occurrences("taco cat")));

	}

	public static int[] count_Occurrences(String s) {
		  String new_string = s.toLowerCase();
	    int[] occurrences = new int[128];
	    for(int i = 0; i < new_string.length(); i++) {
	      char c = new_string.charAt(i);
	      occurrences[(int) c]++;
	    }
	    return occurrences;
	}
	public static boolean isPalindromePermutation(int[] arr) {
  		boolean odd_occurrences = false;
  		for(int i = 97; i < 123; i++) {
  			if(arr[i] % 2 != 0) {
  				if(odd_occurrences) {
  					return false;
  				}
  				odd_occurrences = true;
  			}
  		}
  		for(int i = 48; i < 58; i++) {
  			if(arr[i] % 2 != 0) {
  				if(odd_occurrences) {
  					return false;
  				}
  				odd_occurrences = true;
  			}
  		}
  		return true;
  	}
}
