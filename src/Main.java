import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Try changing this to {} to test exception case
        String[] bogieIds = {"BG101", "BG205", "BG309"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        try {
            boolean result = searchBogie(bogieIds, key);

            if (result) {
                System.out.println("\nSearch Result: Bogie ID exists.");
            } else {
                System.out.println("\nSearch Result: Bogie ID NOT found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        System.out.println("\nProgram continues...");
    }

    // UC20: Safe search method with validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // 🔴 Fail-Fast Validation
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train.");
        }

        // Step 1: Sort before binary search
        Arrays.sort(bogieIds);

        // Step 2: Binary Search
        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true; // found
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false; // not found
    }
}