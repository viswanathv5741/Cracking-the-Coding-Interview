import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AdjacencyMatrix {

	int nodes;
	int[][] matrix;

	public AdjacencyMatrix(int[][] m) {
		nodes = m.length;
		matrix = m;
	}

	public List<Integer> getSuccessors(int n) {
		List<Integer> successors = new ArrayList<Integer>();
		for (int i = 0; i < matrix[n].length; i++) {
			if (matrix[n][i] != 0) {
				successors.add(i);
			}
		}
		return successors;
	}

	public List<Integer> getPredecessors(int n) {
		List<Integer> predecessors = new ArrayList<Integer>();
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][n] != 0) {
				predecessors.add(i);
			}
		}
		return predecessors;
	}

	public boolean getPath(int source, int target) {
		LinkedList<Integer> pathf = new LinkedList<>();
		LinkedList<Integer> pathb = new LinkedList<>();
		HashSet<Integer> markedf = new HashSet<>();
		HashSet<Integer> markedb = new HashSet<>();
		boolean intersect = false;
		pathf.add(source);
		pathb.add(target);
		while (!pathf.isEmpty()) {
			int pos = pathf.removeFirst();
			int end = pathb.removeFirst();
			List<Integer> posChild = getSuccessors(pos);
			List<Integer> endParent = getPredecessors(end);
			for (int i = 0; i < posChild.size(); i++) {
				if (!markedf.contains(posChild.get(i))) {
					markedf.add(posChild.get(i));
					pathf.add(posChild.get(i));
				}
				for (int j = 0; j < endParent.size(); j++) {
					if (!markedb.contains(endParent.get(j))) {
						markedb.add(endParent.get(j));
						pathb.add(endParent.get(j));
					}
				}
				HashSet<Integer> intersection = new HashSet<>(markedf);
				intersection.retainAll(markedf);
				if (!intersection.isEmpty()) {
					return true;
				}
			}
		}
		return intersect;
	}
}
