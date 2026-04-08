import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString() for clean printing
    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // Display before sorting
        System.out.println("\nBefore Sorting:");
        System.out.println(bogies);

        // Sort bogies by capacity (ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display after sorting
        System.out.println("\nAfter Sorting by Capacity:");
        System.out.println(bogies);

        System.out.println("\nProgram continues...");
    }
}