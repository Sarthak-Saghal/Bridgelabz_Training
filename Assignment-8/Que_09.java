public class Que_09 {


    private String ownerName;
    private String vehicleType;


    private static double registrationFee = 1000.0;  

   
    public Que_09(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

   
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
        System.out.println("--------------------------");
    }


    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to $" + registrationFee);
    }

    public static void main(String[] args) {
        // Create vehicles
        Que_09 v1 = new Que_09("Sarthak", "Car");
        Que_09 v2 = new Que_09("Nitin", "Motorbike");


        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        updateRegistrationFee(1500.0);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

