package zaffora;

/**
 * For this assignment I chose to use a doubly linked List instead of a circular array.
 * The efficiency in both ways are similar, but using the linked lists creates
 * a more stable program since the memory can expand more easily and uses less
 * resources when there is less "traffic" at the airport. This way I'm able to have 2 runways
 * of different sizes and varying sizes.
 */

public class Main {

    public static void  main(String[] args) {
	    // creating the 2 runways
        DequeDblLinkedListImpl<airplain> ruway1 = new DequeDblLinkedListImpl<>();
        DequeDblLinkedListImpl<airplain> ruway2 = new DequeDblLinkedListImpl<>();
        ruway1.setName("Runway 1");
        ruway2.setName("Runway 2");

        // creating the planes
        airplain ap1 = new airplain(100, "Airbus", "747");
        airplain ap2 = new airplain(101, "Airbus", "747");
        airplain ap3 = new airplain(102, "Airbus", "747");
        airplain ap4 = new airplain(103, "Airbus", "747");
        airplain ap5 = new airplain(104, "Airbus", "747");
        airplain ap6 = new airplain(105, "Airbus", "747");
        airplain ap7 = new airplain(106, "Airbus", "747");
        airplain ap8 = new airplain(107, "Airbus", "747");

        // Simulating an airport
        /** with a small amount of work you can make this
         * interactive for the user by using a switch menu */
        
        Land(ruway1, ap1);
        Land(ruway2, ap2);
        Land(ruway1, ap3);
        Land(ruway2, ap4);
        Takeoff(ruway1);
        Takeoff(ruway2);
        Land(ruway1,ap5);
        Land(ruway2, ap6);
        EmergencyBack(ruway1);
        EmergencyFront(ruway2, ap5);
        Size(ruway1);
        Takeoff(ruway1);
        Takeoff(ruway1);


    }

    // Main Driver functions for Airport control

    // Removes plane from the front of a Q
    public static void Takeoff(DequeDblLinkedListImpl<airplain> runway){
        runway.removeFront();
    }

    // Adds plane to the back of a Q
    public static void Land(DequeDblLinkedListImpl<airplain> runway, airplain plain){
        runway.insertRear(plain);
    }

    // Removes a plain from the back of a Q
    public static void EmergencyBack(DequeDblLinkedListImpl<airplain> runway){
        runway.removeRear();
    }

    // Adds a plane to the front of a Q
    public static void EmergencyFront(DequeDblLinkedListImpl<airplain> runway, airplain plane){
        runway.insertFront(plane);
    }

    // Reports the size of the selected runway
    public static void Size(DequeDblLinkedListImpl<airplain> runway){
        System.out.println(runway.getName() + " has " + runway.size() + " planes in line");
    }
}
