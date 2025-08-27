import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Que_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a date (yyyy-mm-dd) ");

        String time=sc.nextLine();
        LocalDate date=LocalDate.parse(time);
        
        System.out.println("original date"+ time);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate=date.format(formatter);

        System.out.println("Formatted (dd-MM-yyyy)=> "+formattedDate);

        DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("EEE-MMM-dd-YYYY");
        String formattedDate2=date.format(formatter2);
        System.out.println("Fromatted (EEE-MMM-DD-YYYY)=> "+formattedDate2);
         
        DateTimeFormatter formatter3=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedData3=date.format(formatter3);
        System.out.println("Formatted(yyyy-MM-dd)"+formattedData3);

    
    }
}
