import java.time.LocalDate;
import java.util.Scanner;

public class Que_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first date(yyy-MM-dd)");
        String data1Str=sc.nextLine();
        LocalDate date1=LocalDate.parse(data1Str);

        System.out.println("Enter second date (yyyy-MM-dd): ");
        String date2Str = sc.nextLine();
        LocalDate date2 = LocalDate.parse(date2Str);

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is the same as " + date2);
        }
    }
} 
