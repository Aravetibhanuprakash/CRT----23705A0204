import java.util.*;

public class GraphAdjust {
    private Map<Integer, List<Integer>> adjacencyList;

    public GraphAdjust() {
        adjacencyList = new HashMap<>();
    }

    // Add a vertex
    public void addVertex(int v) {
        adjacencyList.putIfAbsent(v, new ArrayList<>());
    }

    // Add an edge (undirected)
    public void addEdge(int v1, int v2) {
        adjacencyList.putIfAbsent(v1, new ArrayList<>());
        adjacencyList.putIfAbsent(v2, new ArrayList<>());
        adjacencyList.get(v1).add(v2);
        adjacencyList.get(v2).add(v1);
    }

    // Remove an edge (undirected)
    public void removeEdge(int v1, int v2) {
        List<Integer> edgesV1 = adjacencyList.get(v1);
        List<Integer> edgesV2 = adjacencyList.get(v2);
        if (edgesV1 != null) edgesV1.remove(Integer.valueOf(v2));
        if (edgesV2 != null) edgesV2.remove(Integer.valueOf(v1));
    }

    // Print the graph
    public void printGraph() {
        for (int vertex : adjacencyList.keySet()) {
            System.out.print(vertex + " -> ");
            for (int neighbor : adjacencyList.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphAdjust graph = new GraphAdjust();

        // Add vertices
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        // Add edges
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        System.out.println("Graph after adding edges:");
        graph.printGraph();

        // Remove edge
        graph.removeEdge(1, 2);
        System.out.println("Graph after removing edge between 1 and 2:");
        graph.printGraph();
    }
}
