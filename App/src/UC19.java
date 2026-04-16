import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistBinarySearchApp {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        // Handle empty array
        if (bogieIds.length == 0) {
            return false;
        }

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true; // Found
            } else if (comparison < 0) {
                high = mid - 1; // Search left
            } else {
                low = mid + 1; // Search right
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        // Step 1: Create (possibly unsorted) bogie IDs
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 2: Sort before Binary Search
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        Scanner sc = new Scanner(System.in);

        // Step 3: Input search key
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // Step 4: Perform Binary Search
        boolean found = binarySearch(bogieIds, key);

        // Step 5: Display result
        if (found) {
            System.out.println("✅ Bogie ID found.");
        } else {
            System.out.println("❌ Bogie ID NOT found.");
        }

        System.out.println("\nProgram continues...");
    }
}
