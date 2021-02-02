package zaffora;

/**
 * Why were there were so many collisions?
 * The hashing algorithm used was very simple and the
 * size of the hash table is smaller than the data size.
 *
 * What would be the best array size for the
 * hash table for this program?
 * If the data set doesn't change, than the same size as the data set
 * given that each hash is unique
 */

import  java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Apps> appStore = (ArrayList<Apps>) CSVdriver.readDeck();
	    int storeSize = appStore.size();
        DictionaryInterface<String, Apps> appStoreList = new HashedDictionary<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Loading dictionary");

        for (int i=0; i<storeSize; i++){
            appStoreList.add(appStore.get(i).getName(), appStore.get(i));
        }

        System.out.println("Dictionary has finished loading");
        System.out.println("What app do you want to find?");

        String key = input.nextLine();


            if (appStoreList.contains(key) == true){
                System.out.println(appStoreList.getValue(key));
            } else {
                System.out.println("The dictionary doesn't contain that app");
            }

    }
}
