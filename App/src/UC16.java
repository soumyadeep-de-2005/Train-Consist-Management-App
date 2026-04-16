import java.util.Arrays;

public class TrainConsistSortingApp {

    // Bubble Sort Method
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparison
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap logic
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Step 1: Create array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting: " + Arrays.toString(capacities));

        // Step 2: Perform Bubble Sort
        bubbleSort(capacities);

        // Step 3: Display sorted result
        System.out.println("After Sorting:  " + Arrays.toString(capacities));

        System.out.println("\nProgram continues...");
    }
}
