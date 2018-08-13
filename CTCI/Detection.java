import java.util.Stack;

public class Detection{

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
		g.next = e;

		System.out.println(isLoop(e));




	}
	public static boolean isLoop(Node current) {
		Node slow = current;
		Node fast = current.next;
		while(slow != null && fast != null) {
			if(slow == fast) {
				return true;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return false;
	}


}
