// Interface 1
interface LuggageScanner {

    // Abstract method
    boolean scanLuggage(double luggageWeight);

    // Default method
    default void displaySecurityGuidelines() {
        System.out.println("Luggage Guidelines:");
        System.out.println("Maximum allowed luggage weight is 25 kg.");
    }

    // Static method
    static boolean isPassportNumberValid(String passportNo) {
        // Passport number must start with 'P' and have 8 characters
        return passportNo.length() == 8 &&
               passportNo.startsWith("P");
    }
}

// Interface 2
interface PassportVerifier {

    // Abstract method
    boolean verifyPassport(String passportNo);

    // Default method
    default void displaySecurityGuidelines() {
        System.out.println("Passport Guidelines:");
        System.out.println("Passengers must carry a valid passport.");
    }
}

// Class implementing both interfaces
class AirportSecuritySystem
        implements LuggageScanner, PassportVerifier {

    // Implement abstract method of LuggageScanner
    @Override
    public boolean scanLuggage(double luggageWeight) {
        return luggageWeight <= 25;
    }

    // Implement abstract method of PassportVerifier
    @Override
    public boolean verifyPassport(String passportNo) {
        return LuggageScanner.isPassportNumberValid(passportNo);
    }

    // Resolve default method conflict
    @Override
    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }
}

// Main class
public class AirportSecurityDemo {

    public static void main(String[] args) {

        // Arrays storing passenger details
        String[] passengerNames = {
                "Amit", "Priya", "Rahul", "Sneha"
        };

        String[] passportNumbers = {
                "P1234567", "A9876543", "P7654321", "P111"
        };

        double[] luggageWeights = {
                20.5, 28.0, 18.0, 22.0
        };

        AirportSecuritySystem security =
                new AirportSecuritySystem();

        // Display guidelines
        security.displaySecurityGuidelines();

        System.out.println("\nPassenger Verification:\n");

        // Check each passenger
        for (int i = 0; i < passengerNames.length; i++) {

            System.out.println("Passenger: " + passengerNames[i]);

            boolean passportValid =
                    security.verifyPassport(passportNumbers[i]);

            boolean luggageValid =
                    security.scanLuggage(luggageWeights[i]);

            if (passportValid && luggageValid) {
                System.out.println("Status: Allowed to Board");
            } else {
                System.out.println("Status: Not Allowed to Board");
            }

            System.out.println();
        }
    }
}