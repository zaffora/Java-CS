package zaffora;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PokedexDriverCSV {
	public static List<Pokemon> readDeck() {

		// The following is adapted from Example 1. Using Buffered Reader and String.split() from https://www.javainterviewpoint.com/how-to-read-and-parse-csv-file-in-java/
		BufferedReader br = null;
		try
		{
			//Reading the csv file
			br = new BufferedReader(new FileReader("pokemon.csv"));

			//Create List for holding Pokemon objects
			List<Pokemon> pokemonList = new ArrayList<Pokemon>();

			String line = "";
			
			//Read to skip the header
			br.readLine();
			//Reading from the second line
			while ((line = br.readLine()) != null) 
			{
				String[] pokemonDetails = line.split(",");
				// When the string is split, it will result in an array with the following information in the corresponding index

				//System.out.println(pokemonDetails[1] + ", HP: " + pokemonDetails[5]);
				
				if(pokemonDetails.length > 0 )
				{
					//Create a temporary pokemon
					Pokemon pokemon = new Pokemon(pokemonDetails[0], pokemonDetails[1], pokemonDetails[2], pokemonDetails[3], pokemonDetails[4], pokemonDetails[5], pokemonDetails[6], pokemonDetails[7], pokemonDetails[8], pokemonDetails[9], pokemonDetails[10], pokemonDetails[11], pokemonDetails[12]);

					// Save the Pokemon details in Pokemon object
					pokemonList.add(pokemon);
				}
			} // end of the while loop

			/** Prints out the Pokemon
			System.out.print(pokemonList);

			for (int i = 0; i < pokemonList.size(); i++) {
				System.out.println(pokemonList.get(i));
			}
			*/

			return pokemonList;
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			}
			catch(IOException ie)
			{
				System.out.println("Error occured while closing the BufferedReader");
				ie.printStackTrace();
			}
		}
		// End of code adapted from Example 1. Using Buffered Reader and String.split() from https://www.javainterviewpoint.com/how-to-read-and-parse-csv-file-in-java/


		return null;
	}

}


