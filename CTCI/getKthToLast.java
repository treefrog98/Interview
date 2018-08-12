import java.util.ArrayList;

public class getKthToLast{

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

//		Node iterator = a;
//		while(iterator != null) {
//			System.out.print(iterator.value + " ");
//			iterator = iterator.next;
//		}
		System.out.println(getKthToLast(a,2));
		System.out.println(actualGetKthToLast(a,2));

	}
	/* return -1 if it's not possible */

	public static int getKthToLast(Node head, int k) {
		ArrayList<Integer> hold = new ArrayList<>();
		Node first = head;
		int size = 0;
		while(first != null) {
			size += 1;
			hold.add(first.value);
			first = first.next;
		}
		if(k > size) {
			return -1;
		}
		if(k != 0) {
			return hold.get(hold.size()-k);
		}
		return -1;
	}
	public static Node actualGetKthToLast(Node head, int k) {
		Node first = head;
		Node second = head;
		for(int i = 0; i < k-1; i++) {
			if(first == null) {
				return null;
			}
			first = first.next;
		}
		while(first.next != null) {
			second = second.next;
			first = first.next;
		}
		return second;
	}

}
