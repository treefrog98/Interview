public class isPalindromePermutation {

	public static void main(String[] args) {
		System.out.println(isPalindromePermutation(countOccurrences("taco cat")));
	}

	public static int[] countOccurrences(String s) {
		String new_string = s.toLowerCase();
		int[] occurrences = new int[128];
		for (int i = 0; i < new_string.length(); i++) {
			char c = new_string.charAt(i);
			occurrences[(int) c]++;
		}
		return occurrences;
	}
	
	public static boolean isPalindromePermutation(int[] arr) {
		boolean oddOccurrence = false;
		for (int i = 97; i < 123; i++) {
			if (arr[i] % 2 == 1) {
				if (oddOccurrence) {
					return false;
				}
				oddOccurrence = true;
			}
		}
		for (int i = 48; i < 58; i++) {
			if (arr[i] % 2 == 1) {
				if (oddOccurrence) {
					return false;
				}
				oddOccurrence = true;
			}
		}
		return true;
	}
}
