import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // UC18: Array of bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Display available bogies
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // Take user input for search
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nEnter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Linear Search logic
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                System.out.println("\nBogie found at position: " + i);
                break; // Early termination
            }
        }

        // Result
        if (found) {
            System.out.println("Search Result: Bogie ID exists.");
        } else {
            System.out.println("Search Result: Bogie ID NOT found.");
        }

        // Program continues
        System.out.println("\nProgram continues...");
    }
}