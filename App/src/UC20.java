import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistSafeSearchApp {

    // Search Method with Validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // ✅ Fail-Fast Validation
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Cannot perform search.");
        }

        // Linear Search after validation
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Example 1: Empty dataset (will throw exception)
        String[] emptyBogieList = {};

        try {
            System.out.print("Enter Bogie ID to search (Empty List Test): ");
            String key = sc.nextLine();

            boolean result = searchBogie(emptyBogieList, key);
            System.out.println("Result: " + result);

        } catch (IllegalStateException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        System.out.println("\n--- Now testing with valid data ---\n");

        // Example 2: Valid dataset
        String[] bogieIds = {"BG101", "BG205", "BG309"};

        try {
            System.out.print("Enter Bogie ID to search: ");
            String key = sc.nextLine();

            boolean found = searchBogie(bogieIds, key);

            if (found) {
                System.out.println("✅ Bogie found.");
            } else {
                System.out.println("❌ Bogie NOT found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}
