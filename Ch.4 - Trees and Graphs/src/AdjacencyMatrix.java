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

	public Queue<Integer> getPath(int source, int target) {
		Queue<Integer> path = new LinkedList<>();
		List<Integer> sources = getSuccessors(source);
		List<Integer> targets = getPredecessors(target);
		HashSet<Integer> marked = new HashSet<>();
		for (int i = 0; i < sources.size(); i++) {
			if (!marked.contains(sources.get(i))) {
				path.add(sources.get(i));
			}
			
		}
		return path;

	}
}
