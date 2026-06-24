// Superclass
class Device {
    String deviceId;
    String status;

    // Constructor
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass
class Thermostat extends Device {
    int temperatureSetting;

    // Constructor
    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus() method
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " 
                           + temperatureSetting + "°C");
    }
}

// Main class
public class SmartHome {
    public static void main(String[] args) {

        // Creating Thermostat object
        Thermostat thermostat =
                new Thermostat("TH101", "ON", 24);

        // Display current settings
        thermostat.displayStatus();
    }
}