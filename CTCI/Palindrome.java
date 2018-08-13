import java.util.Stack;

public class Palindrome{

	private static class Node {
		public Node next;
		int value;
		public Node() {
			value = 0;
			next = null;
		}
		public Node(int v) {
			value = v;
		}
		public Node(Node n, int v) {
			next = n;
			value = v;
		}
		public String toString() {
			return value + "";
		}
	}

	public static void main(String[] args) {

		Node a = new Node(null, 7);
		Node b = new Node(1);
		Node c = new Node(7);
		a.next = b;
		b.next = c;

		Node e = new Node(null, 7);
		Node f = new Node(1);
		Node g = new Node(7);
		e.next = f;
		f.next = g;


		System.out.println(isPalindrome(a,e));



	}
	public static boolean isPalindrome(Node first, Node second) {
		Stack<Integer> tmp = new Stack<>();
		while(second != null) {
			tmp.push(second.value);
			second = second.next;
		}
		while(first != null) {
			if(tmp.peek() != first.value) {
				return false;
			}
			first = first.next;
			tmp.pop();
		}
		return true;
	}


}
