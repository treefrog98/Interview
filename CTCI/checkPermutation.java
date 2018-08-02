public class checkPermutation {

	public static void main(String[] args) {

		System.out.println(isPalindromeOfEachOther("abc","cba"));
		System.out.println(isPalindromeOfEachOther("bob", "cat"));
		System.out.println(isPalindromeOfEachOther("abc", "aaabbbcccc"));


	}
	// Make the assumption that characters are all lowercased or all uppercased (no mixing)
	public static boolean isPalindromeOfEachOther(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		if(a.equals(b)) {
			return true;
		}
		int[] letters = new int[128];
		for(int i = 0; i < a.length(); i++) {
			letters[(int) a.charAt(i)]++;
			letters[(int) b.charAt(i)]--;
		}
		for(int i = 0; i < letters.length; i++) {
			if(letters[i] != 0) {
				return false;
			}
		}
		return true;
	}



}
