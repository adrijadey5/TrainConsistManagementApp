import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet to maintain order + uniqueness
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        System.out.println("\nAttaching bogies...");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // محاولة إضافة تكرار (duplicate)
        System.out.println("\nAttempting to add duplicate bogie (Sleeper)...");
        trainFormation.add("Sleeper"); // Duplicate - will be ignored

        // Display final formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }

        // Display total count
        System.out.println("\nTotal bogies: " + trainFormation.size());
    }
}