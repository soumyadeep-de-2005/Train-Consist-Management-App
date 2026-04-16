class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    private String shape;   // Rectangular / Cylindrical
    private String cargo;   // Assigned cargo

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {
        try {
            // Validation logic
            if (shape.equalsIgnoreCase("Rectangular") &&
                cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe: Cannot assign Petroleum to Rectangular Bogie"
                );
            }

            // Safe assignment
            this.cargo = cargoType;
            System.out.println("✅ Cargo assigned: " + cargoType + " to " + shape + " bogie");

        } catch (CargoSafetyException e) {
            // Handle exception gracefully
            System.out.println("❌ Error: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("🔄 Assignment attempt completed.\n");
        }
    }

    public String getCargo() {
        return cargo;
    }
}

// Main Application
public class TrainConsistCargoApp {

    public static void main(String[] args) {

        System.out.println("=== Cargo Assignment System ===\n");

        // Safe case
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        // Unsafe case
        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");

        // Another safe case (program continues)
        GoodsBogie b3 = new GoodsBogie("Rectangular");
        b3.assignCargo("Grain");

        System.out.println("Program continues safely after handling exceptions.");
    }
}
