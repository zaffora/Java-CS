package zaffora;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVdriver {
    public static List<Apps> readDeck() {

        // The following is adapted from Example 1. Using Buffered Reader and String.split() from https://www.javainterviewpoint.com/how-to-read-and-parse-csv-file-in-java/
        BufferedReader br = null;
        try
        {
            //Reading the csv file
            br = new BufferedReader(new FileReader("appstore_games.csv"));

            //Create List for holding Pokemon objects
            List<Apps> list = new ArrayList<Apps>();

            String line = "";

            //Read to skip the header
            br.readLine();
            //Reading from the second line
            while ((line = br.readLine()) != null)
            {
                String[] details = line.split(",");
                // When the string is split, it will result in an array with the following information in the corresponding index

                //System.out.println(pokemonDetails[1] + ", HP: " + pokemonDetails[5]);

                if(details.length > 0 )
                {
                    //Create a temporary object

                    Apps appStore = new Apps(details[0], details[1], details[2], details[3], details[4], details[5],
                            details[6], details[7], details[8], details[9], details[10], details[11], details[12],
                            details[13], details[14], details[15], details[16], details[17]);;


                    list.add(appStore);
                }
            } // end of the while loop

            /** Prints out the Pokemon
             System.out.print(list);

             for (int i = 0; i < pokemonList.size(); i++) {
             System.out.println(pokemonList.get(i));
             }
             */

            return list;
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
