// Superclass
class Vehicle {
    int maxSpeed;
    String model;

    // Constructor
    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display vehicle details
    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface
interface Refuelable {
    void refuel();
}

// Subclass: Electric Vehicle
class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    // Method specific to ElectricVehicle
    void charge() {
        System.out.println(model + " is charging.");
    }
}

// Subclass: Petrol Vehicle
class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    // Implementing interface method
    @Override
    public void refuel() {
        System.out.println(model + " is being refueled.");
    }
}

// Main class
public class VehicleManagement {
    public static void main(String[] args) {

        // Creating Electric Vehicle object
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 225);

        System.out.println("Electric Vehicle Details:");
        ev.displayDetails();
        ev.charge();

        // Creating Petrol Vehicle object
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

        System.out.println("\nPetrol Vehicle Details:");
        pv.displayDetails();
        pv.refuel();
    }
}