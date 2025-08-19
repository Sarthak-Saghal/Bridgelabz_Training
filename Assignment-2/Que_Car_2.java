public class Que_Car_2 {
    static int numberOfCars=0;
    String model;
   int year;

   Que_Car_2(String model, int year) {
      this.model = model;
      this.year = year;
        numberOfCars++;
   }

   void display() {
      System.out.println(this.model + " " + this.year);
      System.out.println("");
   }

   public static void main(String[] var0) {
      Que_Car_2 obj1 = new Que_Car_2("Tata", 2025);
      Que_Car_2 obj2 = new Que_Car_2("Mahindra", 2023);
      System.out.println("Total number of object created => " +numberOfCars);
      
    }
}
