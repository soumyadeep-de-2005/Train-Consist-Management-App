class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " Bogie (Capacity: " + capacity + ")";
    }
}

// Main Application
public class TrainConsistExceptionApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Validation System ===");

        try {
            // ✅ Valid Bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + b1);

            // ❌ Invalid Bogie (Negative)
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
            System.out.println("Created: " + b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // ❌ Invalid Bogie (Zero)
            PassengerBogie b3 = new PassengerBogie("First Class", 0);
            System.out.println("Created: " + b3);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // ✅ Multiple Valid Bogies
            PassengerBogie b4 = new PassengerBogie("Sleeper", 80);
            PassengerBogie b5 = new PassengerBogie("AC Chair", 65);

            System.out.println("Created: " + b4);
            System.out.println("Created: " + b5);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}
