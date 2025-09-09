public class Que_06 {
    
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    // Default constructor
        Que_06() {
        this("Unknown Customer", "Standard Car", 1); // constructor chaining
    }

  
    Que_06(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateTotalCost();
    }

    
    double calculateTotalCost() {
        double ratePerDay = 0.0;

       
        switch (carModel.toLowerCase()) {
            case "sedan":
                ratePerDay = 50;
                break;

            case "suv":
                ratePerDay = 100;
                break;

            case "luxury":
                ratePerDay = 200;
                break;

            default: 
                ratePerDay = 40;
        }

        return ratePerDay * rentalDays;
    }

    // Display rental details
    void displayRental() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("----------------------------");
    }

    // Main method to test
    public static void main(String[] args) {
        // Using default constructor
        Que_06 rental1 = new Que_06();
        rental1.displayRental();

        // Using parameterized constructor
        Que_06 rental2 = new Que_06("Alice", "SUV", 5);
        rental2.displayRental();

        Que_06 rental3 = new Que_06("Bob", "Luxury", 3);
        rental3.displayRental();
    }
}

