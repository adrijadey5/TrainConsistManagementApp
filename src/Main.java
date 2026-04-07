import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create HashMap to store bogie and its capacity
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Adding bogie-capacity mappings
        System.out.println("\nAdding bogie capacities...");
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 54);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 100); // Example load capacity

        // Display bogie capacities
        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Example lookup
        System.out.println("\nChecking capacity of Sleeper:");
        System.out.println("Sleeper Capacity: " + bogieCapacityMap.get("Sleeper"));
    }
}