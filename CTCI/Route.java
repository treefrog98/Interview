import java.util.*;
public class Route {


	public static void main(String[] args) {

		HashMap<Integer, ArrayList<Integer>> g = new HashMap<>();

		g.put(1, new ArrayList<>());
		g.get(1).add(2);

		g.put(2, new ArrayList<>());
		g.get(2).add(3);

		g.put(3, new ArrayList<>());
		g.get(3).add(4);

		g.put(4, new ArrayList<>());
		g.get(4).add(2);
		g.get(4).add(5);

		g.put(5, new ArrayList<>());


		// Visited
		HashMap<Integer, Boolean> visited = new HashMap<>();
		for(int i : g.keySet()) {
			visited.put(i, false);
		}
		System.out.println(route(g, visited, 6,4));
	}

	public static  boolean route(HashMap<Integer, ArrayList<Integer>> graph, HashMap<Integer, Boolean> visited, int start, int end) {
		if(graph == null) {
			return false;
		}
		if(!graph.containsKey(start)) {
			return false;
		}
		if(start == end) {
			return true;
		}
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);

		while(!queue.isEmpty()) {
			int current = queue.remove();
			if(!visited.get(current)) {
				visited.put(current, true);
				if(current == end) {
					return true;
				}
				for(int adjacent : graph.get(current)) {
					queue.add(adjacent);
				}
			}
		}
		return false;

	}
	// if the start and end are the same, then return true
	// BFS
		// inside if the node you encounter == end, then return true
	// return false

}
