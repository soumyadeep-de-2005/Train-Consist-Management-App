import java.util.*;
import java.util.stream.*;

// GoodsBogie class
class GoodsBogie {
    String type;   // Cylindrical, Rectangular, etc.
    String cargo;  // Petroleum, Coal, Grain

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " (" + cargo + ")";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create goods bogies list
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        // Try invalid case:
        // goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // Display bogies
        System.out.println("\nGoods Bogies:");
        System.out.println(goodsBogies);

        // Safety check using Stream
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                                b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Display result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("\nTrain is NOT SAFE ❌");
        }

        System.out.println("\nProgram continues...");
    }
}