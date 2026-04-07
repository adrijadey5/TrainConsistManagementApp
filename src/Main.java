import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Unsorted bogie IDs (to also test sorting condition)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Handle empty array case
        if (bogieIds.length == 0) {
            System.out.println("No bogies available.");
            return;
        }

        // Step 1: Sort the array (important precondition)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // Step 2: Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        // Step 3: Binary Search
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                found = true;
                System.out.println("\nBogie found at position: " + mid);
                break;
            } else if (comparison < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1; // search right
            }
        }

        // Step 4: Result
        if (found) {
            System.out.println("Search Result: Bogie ID exists.");
        } else {
            System.out.println("Search Result: Bogie ID NOT found.");
        }

        System.out.println("\nProgram continues...");
    }
}