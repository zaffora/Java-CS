import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Graph {

    private HashMap<Airport, LinkedList<Airport>> adjacencyMap;
    private boolean directed;

    public Graph(boolean directed) {
        this.directed = directed;
        adjacencyMap = new HashMap<>();
    }

    public void addEdgeHelper(Airport a, Airport b) {
        LinkedList<Airport> tmp = adjacencyMap.get(a);

        if(tmp != null) {
            tmp.remove(b);
        }
        else tmp = new LinkedList<>();
        tmp.add(b);
        adjacencyMap.put(a, tmp);
    }

    public void addEdge(Airport src, Airport dest) {

        if (!adjacencyMap.keySet().contains(src))
            adjacencyMap.put(src,null);

        if (!adjacencyMap.keySet().contains(dest))
            adjacencyMap.put(dest, null);

        addEdgeHelper(src, dest);

        if(!directed){
            addEdgeHelper(dest, src);
        }
    }

    public void printEdges() {
        for (Airport node : adjacencyMap.keySet()) {
            System.out.print(node.name + " airport has a route to: ");
            for (Airport neighbor : adjacencyMap.get(node)) {
                System.out.print(neighbor.name + " ");
            }
            System.out.println();
        }
    }

    public boolean hasEdge(Airport src, Airport dest) {
        return adjacencyMap.containsKey(src) &&
                adjacencyMap.get(src).contains(dest);
    }
}