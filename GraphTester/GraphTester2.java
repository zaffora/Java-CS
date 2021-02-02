
public class GraphTester2 {
	
	public static void main(String args[]) 
	{ 
		// create the graph given in above figure 
		int V = 5; 
		StringGraph graph = new StringGraph(V); 
		graph.AddVertice("A", 0);
		graph.AddVertice("B", 1);
		graph.AddVertice("C", 2);
		graph.AddVertice("D", 3);
		graph.AddVertice("E", 4);
		
		
		graph.addEdge( "A", "B"); 
		graph.addEdge( "A", "C"); 
		graph.addEdge( "A", "D"); 
		graph.addEdge( "B", "C"); 
		graph.addEdge( "B", "D"); 
		graph.addEdge( "D", "E"); 
		//graph.addEdge( "E", "F"); 

		// print the adjacency list representation of  
		// the above graph 
		graph.printGraph(); 
	} 

}
