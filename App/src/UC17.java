import java.util.Arrays;

public class TrainConsistSortNamesApp {

    public static void main(String[] args) {

        // Step 1: Create array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Before sorting
        System.out.println("Before Sorting: " + Arrays.toString(bogieNames));

        // Step 2: Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // Step 3: Display sorted result
        System.out.println("After Sorting:  " + Arrays.toString(bogieNames));

        System.out.println("\nProgram continues...");
    }
}
