import java.util.HashSet;

public class RemoveDuplicates{

	private static class Node {
		public Node next;
		int value;
		public Node(int v) {
			value = v;
			next = null;
		}
		public Node(Node n, int v) {
			next = n;
			value = v;
		}
		public String getValue() {
			return value +"";
		}
	}


	public static void main(String[] args) {

		Node a = new Node(null,5);
		Node b = new Node(10);
		Node c = new Node(11);
		Node d = new Node(12);
		Node e = new Node(11);
		Node f = new Node(15);
		Node g = new Node(12);
		Node h = new Node(3);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = h;

		remove_duplicates(a);
		Node current = a;
		while(current != null) {
			System.out.println(current.value);
			current = current.next;
		}

	}
	public static void remove_duplicates(Node head) {
		HashSet<Integer> set = new HashSet<Integer>();
		Node prev = null;
		while(head != null) {
			if(!set.contains(head.value)) {
				set.add(head.value);
				prev = head;
			}
			else {
				prev.next = head.next;
			}
			head = head.next;
		}
	}

}
