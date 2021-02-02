package zaffora;

import java.util.ArrayList;

public class FlightInfo {
	
	static ArrayList<Airport> airportList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		airportList.add(new Airport("JFK", "JFK Airport", "Queens, NY"));
		airportList.add(new Airport("EWR", "Newark Liberty International Airport", "New Jersey, NJ"));
		airportList.add(new Airport("PHL", "Philadelphia Airport", "Philadelphia, PA"));
		airportList.add(new Airport("ILG", "Wilmington Airport", "Wilmington, DE"));
		airportList.add(new Airport("BWI", "Baltimore Airport", "Baltimore, VA"));
		
		Graph<Airport> airports = new Graph<>(airportList);
		airports.addEdge(lookup("JFK"), lookup("BWI"));
		airports.addEdge(lookup("BWI"), lookup("ILG"));
		airports.addEdge(lookup("ILG"), lookup("PHL"));
		airports.addEdge(lookup("BWI"), lookup("PHL"));
		airports.addEdge(lookup("WBI"), lookup("EWR"));
		airports.addEdge(lookup("PHL"), lookup("EWR"));

		// print the adjacency list representation of
		// the whole graphS
		airports.printGraph();


		// TODO print the adjacency of selected airports
		System.out.println("���\nOutputting adjacency lists of PHL and ILG\n");
		airports.printAdjacent(lookup("PHL"));
		airports.printAdjacent(lookup("ILG"));
		
		//TODO implement the method to print all possible paths between two airports
		airports.printAllPaths("EWR", "PHL");
		airports.printAllPaths("EWR", "ILG");
				
		//TODO: Implement the printShortedPath method, so display the shortest route from one airport to another
				
		airports.findShortestPath("EWR", "PHL");
		airports.findShortestPath("EWR", "ILG");

	}

	static Airport lookup(String code) {
		for (Airport ap : airportList)
			if (ap.code.equals(code))
				return ap;
		return null;
	}
}
