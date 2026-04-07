import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList to maintain order
        LinkedList<String> trainConsist = new LinkedList<>();

        // Adding bogies in order
        System.out.println("\nAdding bogies...");
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Insert Pantry Car at position 2 (index 1)
        System.out.println("\nInserting Pantry Car at position 2...");
        trainConsist.add(1, "Pantry Car");

        // Remove first and last bogie
        System.out.println("\nRemoving first and last bogies...");
        trainConsist.removeFirst(); // removes Engine
        trainConsist.removeLast();  // removes Guard

        // Display final ordered train consist
        System.out.println("\nFinal Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }

        // Display total count
        System.out.println("\nTotal bogies: " + trainConsist.size());
    }
}