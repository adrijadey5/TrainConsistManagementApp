// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie class
class GoodsBogie {
    String type;   // Cylindrical / Rectangular
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    // Method to assign cargo safely
    public void assignCargo(String cargo) {

        try {
            // Safety rule
            if (type.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe: Cannot assign Petroleum to Rectangular bogie"
                );
            }

            // Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            // Handle exception
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }

    @Override
    public String toString() {
        return type + " | Cargo: " + (cargo != null ? cargo : "None");
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        System.out.println("\nAssigning Petroleum to Cylindrical...");
        b1.assignCargo("Petroleum");

        // Unsafe assignment
        System.out.println("Assigning Petroleum to Rectangular...");
        b2.assignCargo("Petroleum");

        // Continue execution
        System.out.println("Assigning Coal to Rectangular...");
        b2.assignCargo("Coal");

        // Final state
        System.out.println("\nFinal Bogie States:");
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("\nProgram continues safely...");
    }
}