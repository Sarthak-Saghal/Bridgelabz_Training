public class Que_09 {
   
  
    String movieName;
    String seatNumber;
    double price;

  
    void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!\n");
    }

    void displayTicket() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat No.   : " + seatNumber);
        System.out.println("Price      : " + price);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
       
        Que_09 t1 = new Que_09();
        Que_09 t2 = new Que_09();

    
        t1.bookTicket("Avengers: Endgame", "A10", 250);
        t2.bookTicket("Inception", "B15", 300);

        t1.displayTicket();
        t2.displayTicket();
    }


}
