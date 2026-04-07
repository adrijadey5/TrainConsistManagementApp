import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create a HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates intentionally)
        System.out.println("\nAdding bogie IDs...");

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG104");
        bogieIds.add("BG102"); // Duplicate

        // Display final unique bogie IDs
        System.out.println("\nFinal Unique Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Display total count
        System.out.println("\nTotal unique bogies: " + bogieIds.size());
    }
}