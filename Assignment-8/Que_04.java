public class Que_04 {

    private String guestName;
    private String roomType;
    private int nights;

    // 1. Default constructor
    public Que_04() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // 2. Parameterized constructor
    public Que_04(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // 3. Copy constructor
    public  Que_04( Que_04 other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Display booking details
    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("------------------------");
    }

    // Main method to test
    public static void main(String[] args) {
        // Using default constructor
         Que_04 booking1 = new  Que_04();
        booking1.displayBooking();

        // Using parameterized constructor
         Que_04 booking2 = new  Que_04("John", "Deluxe", 3);
        booking2.displayBooking();

        // Using copy constructor
        Que_04 booking3= new  Que_04(booking2);
        booking3.displayBooking();
    }
}

