import java.util.*;

public class StringGraph {
	
	private int numVertices; 
	private HashMap<String, Integer> HashMap = new HashMap<>();   //vertices
	private LinkedList<String> adjListArray[]; 

	// constructor  
	@SuppressWarnings("unchecked")
	StringGraph(int size) 
	{ 
		this.numVertices = size; 

		// define the size of array as  
		// number of vertices 
		adjListArray = new LinkedList[size]; 

		// Create a new list for each vertex 
		// such that adjacent nodes can be stored 
		for(int i = 0; i < size ; i++){ 
			adjListArray[i] = new LinkedList<String>(); 
		} 
	} 


	void AddVertice(String Key, int Value)
	{
		if(!HashMap.containsKey(Key))
		{
			HashMap.put(Key, Value);
		}
	}
	
	// Adds an edge to an undirected graph 
	void addEdge(String src, String dest) 
	{ 
		
		int i_src = HashMap.get(src);
		int i_dest = HashMap.get(dest);
		// Add an edge from src to dest.  
		adjListArray[i_src].add(dest); 

		// Since graph is undirected, add an edge from dest 
		// to src also 
		adjListArray[i_dest].add(src); 
	} 

	// A utility function to print the adjacency list  
	// representation of graph 
	void printGraph() 
	{        
		for(int v = 0; v < numVertices; v++) 
		{ 
			System.out.println("Adjacency list of vertex "+ v); 
			
			for(int i =0; i < HashMap.size(); i++)
			{
				System.out.print("head"); 
			   for(String pCrawl: adjListArray[i]){ 
				System.out.print(" -> "+pCrawl); 
			   } 
			   System.out.println("\n"); 
			}
			System.out.println("\n"); 
		} 
	} 

}
