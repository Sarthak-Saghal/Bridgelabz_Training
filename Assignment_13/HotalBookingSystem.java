import java.security.PrivateKey;
import java.time.LocalDate;
import java.util.*;

class Room {
    private int RoomId;
    private double Price;
    private String type;

    public Room(int RoomId, double price, String type) {
        this.RoomId = RoomId;
        this.Price = price;
        this.type = type;
    }

    public int getRoomId() {
        return RoomId;
    }

    public double getprice() {
        return Price;
    }

    public String type() {
        return type;
    }

}

class Guest {
    private int guest_id;
    private String name;

    public Guest(int guest_id, String name) {
        this.guest_id = guest_id;
        this.name = name;
    }

    public int getguest_id() {
        return guest_id;
    }

    public String getname() {
        return name;
    }

}

class Booking {
    private int booking_id;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int room_id;
    private int guest_id;

    public Booking(int booking_id, LocalDate checkIn, LocalDate checkOut, int room_id, int guest_id) {
        this.booking_id = booking_id;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.room_id = room_id;
        this.guest_id = guest_id;

    }

    public int getbooking_id() {
        return booking_id;
    }

    public LocalDate getcheckIn() {
        return checkIn;
    }

    public LocalDate getcheckOut() {
        return checkOut;
    }

    public int getRoomId() {
        return room_id;
    }

    public int getguest_id() {
        return guest_id;
    }

}

class HotalBooking {
    private List<Room> rooms = new ArrayList();
    private List<Guest> guests = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    public void addRoom(Room r) {
        rooms.add(r);
    }

    public void addguest(Guest g) {
        guests.add(g);
    }

    public void addBooking(Booking b) {
        bookings.add(b);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void BookingCount() {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < bookings.size(); i++) {
            Booking b = bookings.get(i);
            int roomid = b.getRoomId();
            if(count.containsKey(roomid)){
                count.put(roomid, count.get(roomid)+1);
            }
            else{
                count.put(roomid,1);
            }

        }
        System.out.println(count);
    }
    

}

public class HotalBookingSystem {
    public static void main(String[] args) {
        HotalBooking system = new HotalBooking();

        // Create Rooms
        Room r1 = new Room(1, 1200, "Normal");
        Room r2 = new Room(1, 1500, "Normal");

        // Add Rooms to system
        system.addRoom(r1);
        system.addRoom(r2);

        // Create Guest
        Guest g1 = new Guest(1, "John Doe");

        // Add Guest to system
        system.addguest(g1);

        // Create Booking
        Booking b1 = new Booking(
                1,
                LocalDate.of(2025, 9, 1),
                LocalDate.of(2025, 9, 5),
                r1.getRoomId(),
                g1.getguest_id()
        );

        // Add Booking to system
        system.addBooking(b1);

      
        system.BookingCount();  // No println needed, method already prints

    }

}