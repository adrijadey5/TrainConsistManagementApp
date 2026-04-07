import java.util.*;
import java.util.stream.Collectors;

// Bogie class (extended with type)
class Bogie {
    String name;
    int capacity;
    String type; // Passenger or Goods

    Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " | Capacity: " + capacity;
    }
}

public class Main {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 56, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));
        bogies.add(new Bogie("Rectangular", 120, "Goods"));
        bogies.add(new Bogie("Cylindrical", 150, "Goods"));
        bogies.add(new Bogie("Sleeper", 72, "Passenger")); // duplicate type example

        // Display original list
        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // Grouping by type
        System.out.println("\nGrouping bogies by type...");

        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // Display grouped result
        System.out.println("\nGrouped Bogies:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }

        // Verify original list unchanged
        System.out.println("\nOriginal List After Grouping (Unchanged):");
        bogies.forEach(System.out::println);
    }
}