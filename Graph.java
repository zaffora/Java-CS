package zaffora;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {
  private Map<T, Node> nodes = new HashMap<T, Node>();

  public Graph() {}

  public void addEdge(T nodeName1, T nodeName2) {
    Node node1 = nodes.get(nodeName1);
    if (node1 == null) {
      node1 = new Node(nodeName1);
    }

    Node node2 = nodes.get(nodeName2);
    if (node2 == null) {
      node2 = new Node(nodeName2);
    }

    node1.addNeighbor(node2);
    node2.addNeighbor(node1);

    nodes.put(nodeName1, node1);
    nodes.put(nodeName2, node2);
  }

  public List<T> findShortestPath(T startNodeName, T endNodeName) {
    // key node, value parent
    Map<T, T> parents = new HashMap<T, T>();
    List<Node> temp = new ArrayList<Node>();

    Node start = nodes.get(startNodeName);
    temp.add(start);
    parents.put(startNodeName, null);

    while (temp.size() > 0) {
      Node currentNode = temp.get(0);
      List<Node> neighbors = currentNode.getNeighbors();

      for (int i = 0; i < neighbors.size(); i++) {
        Node neighbor = neighbors.get(i);
        T nodeName = (T) neighbor.getName();

        // a node can only be visited once if it has more than one parents
        boolean visited = parents.containsKey(nodeName);
        if (visited) {
          continue;
        } else {
          temp.add(neighbor);

          // parents map can be used to get the path
          parents.put(nodeName, (T) currentNode.getName());

          // return the shortest path if end node is reached
          if (nodeName.equals(endNodeName)) {
            System.out.println(parents);
            return printAllPaths(parents, endNodeName);
          }
        }
      }

      temp.remove(0);
    }

    return null;
  }

  private List<T> printAllPaths(Map<T, T> parents, T endNodeName) {
    List<T> path = new ArrayList<T>();
    T node = endNodeName;
    while (node != null) {
      path.add(0, node);
      T parent = parents.get(node);
      node = parent;
    }
    return path;
  }
}

class Node<T> {
  T name;
  List<Node> neighbors = new ArrayList<Node>();

  public Node(T name) {
    this.name = name;
  }

  public T getName() {
    return this.name;
  }

  public void addNeighbor(Node neighbor) {
    neighbors.add(neighbor);
  }

  public List<Node> getNeighbors() {
    return neighbors;
  }

  public T toT() {
    return this.name;
  }
}