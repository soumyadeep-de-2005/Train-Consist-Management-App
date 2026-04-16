import java.util.Scanner;

public class TrainConsistSearchApp {

    // Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {

        // Traverse array sequentially
        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                return true; // Match found → early termination
            }
        }

        return false; // No match found
    }

    public static void main(String[] args) {

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner sc = new Scanner(System.in);

        // Step 2: Take user input
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Step 3: Perform search
        boolean found = linearSearch(bogieIds, searchKey);

        // Step 4: Display result
        if (found) {
            System.out.println("✅ Bogie ID found in the consist.");
        } else {
            System.out.println("❌ Bogie ID NOT found.");
        }

        System.out.println("\nProgram continues...");
    }
}
