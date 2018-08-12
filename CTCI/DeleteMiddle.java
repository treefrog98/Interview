public class DeleteMiddle{

	private static class Node {
		public Node next;
		int value;
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

		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);
		Node h = new Node(8);
		Node i = new Node(9);
		Node j = new Node(10);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = h;
		h.next = i;
		i.next = j;

    System.out.println(deleteMiddle(5));

	}


	public static boolean deleteMiddle(Node current) {
		if(current == null || current.next == null) {
			return false;
		}
		Node ahead = current.next;
		current.value = ahead.value;
		current.next = ahead.next;
		return true;
	}

}
