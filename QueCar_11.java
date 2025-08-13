public class QueCar_11 {
    
    String brand;
    int speed;
    static int wheels=4;

    QueCar_11(String brand , int speed){
        this.brand=brand;
        this.speed=speed;
    }
    @Override
    public String toString(){
        return "Brand: "+brand+", Speed "+speed+" km/h, Wheels: "+wheels;
    }
        
    public static void main(String[] args) {
        QueCar_11 car1=new QueCar_11("Toyota", 180);
        QueCar_11 car2=new QueCar_11("BMW", 240);
        QueCar_11 car3=new QueCar_11("Honda", 160);
        

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
