public class oneEdit{


	public static void main(String[] args) {


		System.out.println(oneEdit("pale","ple"));
		System.out.println(oneEdit("pales", "pale"));


	}
	/* Check if 2 strings are 1 edit or less away from each other based on insertion,removal,replacement */
	public static boolean oneEdit(String a, String b) {
		if(a.equals(b)) {
			return true;
		}
		if(Math.abs(a.length() - b.length()) > 1) {

			return false;
		}
		int diff = Math.abs(a.length()-b.length());
		if(diff == 0) {
			int toReplace = 0;
			for(int i = 0; i < a.length(); i++) {
				if(toReplace > 1) {
					return false;
				}
				if(a.charAt(i) != b.charAt(i)) {
					toReplace +=1;
				}
			}
			return true;
		}
		else {
			if(a.contains(b)) {
				return true;
			}
			if(b.contains(a)) {
				return true;
			}
			int pointer1 = 0, pointer2 = 0;
			String small = a.length() > b.length() ? b : a;
			String longer = a.length() > b.length() ? a : b;
			int occurrences = 0;
			while(pointer1 < small.length() && pointer2 < longer.length()) {
				if(small.charAt(pointer1) != longer.charAt(pointer2)) {
					occurrences +=1;
				}
				pointer1++;
				pointer2++;
			}
			if(occurrences > 2) {
				return false;
			}
			return true;
		}

	}


}
