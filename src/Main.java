import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize train consist
        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // ---------------- UC2 START ----------------

        // Add passenger bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("\nPassenger bogies added.");
        System.out.println("Current Train Consist: " + trainConsist);

        // Remove one bogie (AC Chair)
        trainConsist.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair bogie:");
        System.out.println("Current Train Consist: " + trainConsist);

        // Check existence of Sleeper bogie
        if (trainConsist.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does NOT exist in the train.");
        }

        // Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        // ---------------- UC2 END ----------------
    }
}