package zaffora;

import java.util.*;

public class Main {

    public static void main(String[] args) {
     
        BST<String,Apps> tree = new BST();
        ArrayList<Apps> appStore = (ArrayList<Apps>) CSVdriver.readDeck();
        Scanner input = new Scanner(System.in);

        System.out.println("Loading data");

        for (int i=0; i<appStore.size(); i++){
            tree.insert(appStore.get(i).getName(), appStore.get(i));
        }

        System.out.println("Data has finished loading");
        System.out.println("What app do you want to find?");
        String key = input.nextLine();

        if (tree.find(key) != null){
            System.out.println(tree.find(key));
            System.out.println("Finding this took " + tree.getComparisons() + " comparisons.");
        } else {
            System.out.println("The dictionary doesn't contain that app");
        }

    }
}
