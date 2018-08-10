public class StringRotation{


	public static void main(String[] args) {

		System.out.println(isSubstring("hi","ih"));

    
	}

	public static boolean isSubstring(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		return (a+a).indexOf(b) > -1;
	}


}
